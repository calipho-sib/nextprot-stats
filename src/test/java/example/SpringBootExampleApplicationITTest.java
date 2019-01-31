package example;

import example.domain.AddressBook;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

// SpringApplicationConfiguration not found: https://github.com/spring-projects/spring-boot/wiki/Spring-Boot-1.4-Release-Notes
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(classes = Application.class)
//@WebIntegrationTest // => @IntegrationTest + @WebAppConfiguration
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SpringBootExampleApplicationITTest {

	@LocalServerPort
	private int actualPort;

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void whenUsingRestTemplate_thenSucceed() {
		ResponseEntity<AddressBook.Course> course = restTemplate.getForEntity("http://localhost:" + actualPort + "/courses/1",
				AddressBook.Course.class);
		assertResponse(course.toString());
	}

	private void assertResponse(String response) {
		assertThat(response, containsString("id"));
		assertThat(response, containsString("course_name"));
		assertThat(response, containsString("REST with Spring"));
		assertThat(response, containsString("student"));
		assertThat(response, containsString("first_name"));
		assertThat(response, containsString("last_name"));
		assertThat(response, containsString("email"));
		assertThat(response, containsString("bob.sponge@gmail.com"));
		assertThat(response, containsString("james.bond@gmail.com"));
		assertThat(response, containsString("phone"));
		assertThat(response, containsString("number"));
		assertThat(response, containsString("type"));
	}
}
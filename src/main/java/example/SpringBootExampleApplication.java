package example;

import example.domain.AddressBook;
import example.domain.CourseRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.protobuf.ProtobufHttpMessageConverter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


// http://localhost:8081/swagger-ui.html#/
// https://www.baeldung.com/spring-boot
@SpringBootApplication
public class SpringBootExampleApplication {

	@Bean
	ProtobufHttpMessageConverter protobufHttpMessageConverter() {
		return new ProtobufHttpMessageConverter();
	}

	@Bean
	public CourseRepository createTestCourses() {
		Map<Integer, AddressBook.Course> courses = new HashMap<>();
		AddressBook.Course course1 = AddressBook.Course.newBuilder()
				.setId(1)
				.setCourseName("REST with Spring")
				.addAllStudent(createTestStudents())
				.build();
		AddressBook.Course course2 = AddressBook.Course.newBuilder()
				.setId(2)
				.setCourseName("Learn Spring Security")
				.addAllStudent(new ArrayList<>())
				.build();
		courses.put(course1.getId(), course1);
		courses.put(course2.getId(), course2);
		return new CourseRepository(courses);
	}

	private Iterable<? extends AddressBook.Student> createTestStudents() {

		AddressBook.Student jamesBond = AddressBook.Student.newBuilder()
				.setId(1)
				.setFirstName("James")
				.setLastName("Bond")
				.setEmail("james.bond@gmail.com")
				.addPhone(AddressBook.Student.PhoneNumber.newBuilder()
						.setNumber("007")
						.setType(AddressBook.Student.PhoneType.MOBILE))
				.addPhone(AddressBook.Student.PhoneNumber.newBuilder()
						.setNumber("0077777")
						.setType(AddressBook.Student.PhoneType.LANDLINE))
				.build();

		AddressBook.Student spongeBob = AddressBook.Student.newBuilder()
				.setId(2)
				.setFirstName("Bob")
				.setLastName("Sponge")
				.setEmail("bob.sponge@gmail.com")
				.addPhone(AddressBook.Student.PhoneNumber.newBuilder()
						.setNumber("000")
						.setType(AddressBook.Student.PhoneType.MOBILE))
				.addPhone(AddressBook.Student.PhoneNumber.newBuilder()
						.setNumber("00000000")
						.setType(AddressBook.Student.PhoneType.LANDLINE))
				.build();

		return Arrays.asList(jamesBond, spongeBob);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootExampleApplication.class, args);
	}
}


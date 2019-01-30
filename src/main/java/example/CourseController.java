package example;

import io.swagger.annotations.ApiOperation;
import example.domain.AddressBook;
import example.domain.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@Autowired
	private CourseRepository courseRepo;

	@RequestMapping(path="/courses/{id}", method = RequestMethod.GET, produces = { "application/json", "application/x-protobuf"})
	@ApiOperation("Returns the requested course.")
	public AddressBook.Course protoBufCustomer(@PathVariable Integer id) {

		return courseRepo.getCourse(id);
	}
}
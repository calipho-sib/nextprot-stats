package org.nextprot.stats;

import com.googlecode.protobuf.format.JsonFormat;
import org.nextprot.stats.domain.AddressBook.Course;
import org.nextprot.stats.domain.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@Autowired
	private CourseRepository courseRepo;

	@RequestMapping("/courses/protobuf/{id}")
	public Course protoBufCustomer(@PathVariable Integer id) {

		return courseRepo.getCourse(id);
	}

	@RequestMapping("/courses/json/{id}")
	public String jsonCustomer(@PathVariable Integer id) {

		JsonFormat jsonFormat = new JsonFormat();
		return jsonFormat.printToString(protoBufCustomer(id));
	}
}
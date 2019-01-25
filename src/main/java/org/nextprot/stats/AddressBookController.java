package org.nextprot.stats;

import org.nextprot.stats.domain.AddressBook;
import org.nextprot.stats.domain.AddressBookPojo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class AddressBookController {

	@RequestMapping("/addressbook/json")
	public AddressBookPojo getAddressBookInJson() {

		AddressBookPojo.PhoneNumber phoneNumberLand = new AddressBookPojo.PhoneNumber();
		phoneNumberLand.setNumber("007");
		phoneNumberLand.setType(AddressBookPojo.PhoneType.LANDLINE);

		AddressBookPojo.PhoneNumber cellphoneNumber = new AddressBookPojo.PhoneNumber();
		cellphoneNumber.setNumber("007");
		cellphoneNumber.setType(AddressBookPojo.PhoneType.MOBILE);

		AddressBookPojo.Student student = new AddressBookPojo.Student();
		student.setId(1);
		student.setFirstName("James");
		student.setLastName("Bond");
		student.setEmail(student.getFirstName()+"."+student.getLastName()+"@mail.com");
		student.setPhone(Arrays.asList(phoneNumberLand, cellphoneNumber));

		AddressBookPojo.Course course = new AddressBookPojo.Course();
		course.setId(12);
		course.setCourseName("Killing");
		course.setStudent(Arrays.asList(student));

		AddressBookPojo addressBook = new AddressBookPojo();
		addressBook.setCourse(course);

		return addressBook;
	}

	@RequestMapping("/addressbook/proto")
	public AddressBook getAddressBookInProtoBuf() {

		return null;
	}
}
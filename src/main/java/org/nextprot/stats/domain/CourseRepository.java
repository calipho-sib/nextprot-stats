package org.nextprot.stats.domain;

import java.util.Map;

public class CourseRepository {

	private Map<Integer, AddressBook.Course> courses;

	public CourseRepository (Map<Integer, AddressBook.Course> courses) {
		this.courses = courses;
	}

	public AddressBook.Course getCourse(int id) {
		return courses.get(id);
	}
}

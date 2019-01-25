package org.nextprot.stats.domain;

import java.util.List;

public class AddressBookPojo {

	private Course course;

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public static class Course {
		private int id;
		private String courseName;
		private List<Student> student;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getCourseName() {
			return courseName;
		}

		public void setCourseName(String courseName) {
			this.courseName = courseName;
		}

		public List<Student> getStudent() {
			return student;
		}

		public void setStudent(List<Student> student) {
			this.student = student;
		}
	}

	public static class Student {
		private int id;
		private String firstName;
		private String lastName;
		private String email;
		private List<PhoneNumber> phone;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getEmail() {
			return email;
		}

		public List<PhoneNumber> getPhone() {
			return phone;
		}

		public void setPhone(List<PhoneNumber> phone) {
			this.phone = phone;
		}

		public void setEmail(String email) {
			this.email = email;
		}
	}

	public static class PhoneNumber {
		private String number;
		private PhoneType type;

		public String getNumber() {
			return number;
		}

		public void setNumber(String number) {
			this.number = number;
		}

		public PhoneType getType() {
			return type;
		}

		public void setType(PhoneType type) {
			this.type = type;
		}
	}

	public enum PhoneType {
		MOBILE,
		LANDLINE
	}
}

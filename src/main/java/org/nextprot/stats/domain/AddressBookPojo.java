package org.nextprot.stats.domain;

import java.util.List;

public class AddressBookPojo {

	public static class Course {
		private int id;
		private String courseName;
		private List<Student> student;

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
	}

	public enum PhoneType {
		MOBILE,
		LANDLINE
	}
}

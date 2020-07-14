package yte.intern.web.dto;

public class Student {

	private String name;
	private String surname;
	private Long age;

	public Student(final String name, final String surname, final Long age) {
		this.name = name;
		this.surname = surname;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(final String surname) {
		this.surname = surname;
	}

	public Long getAge() {
		return age;
	}

	public void setAge(final Long age) {
		this.age = age;
	}
}

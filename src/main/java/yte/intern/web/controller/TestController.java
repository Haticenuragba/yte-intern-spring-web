package yte.intern.web.controller;

import org.springframework.web.bind.annotation.*;
import yte.intern.web.dto.Person;
import yte.intern.web.dto.Student;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class TestController {

	@GetMapping("/student")
	public Student getStudent() {
		return new Student("Fatih", "Doğmuş", 25L);
	}

	@PostMapping("/addStudent")
	public void addStudent(@RequestBody Student student) {
		System.out.println(student.getName());
	}

	@PostMapping("/addPeople")
	public List<Person> addPeople(@RequestBody List<Person> people) {
		people.forEach(person -> person.yasiArtir());
		return people;
	}
}

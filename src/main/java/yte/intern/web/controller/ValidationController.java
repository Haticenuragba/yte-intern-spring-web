package yte.intern.web.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import yte.intern.web.dto.User;

import javax.validation.Valid;

@RestController
public class ValidationController {

	@PostMapping("/validate")
	public void validate(@Valid @RequestBody User user) {
		System.out.println(user);
	}

}

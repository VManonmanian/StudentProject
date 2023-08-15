package com.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@Autowired
	//@Qualifier("senior")
	Student student;
	@GetMapping("getStudent")
	public String getStudent() {
		return student.getMessage();
	}
}

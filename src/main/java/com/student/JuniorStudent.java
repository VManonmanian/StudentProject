package com.student;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
@Service("junior")
@Primary
public class JuniorStudent implements Student {

	@Override
	
	public String getMessage() {
		// TODO Auto-generated method stub
		return "junior student implementation new Student";
	}	
}

package com.student;

import org.springframework.stereotype.Service;

@Service("senior")
public class SeniorStudent implements Student {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Implementation of senior student";
	}

}

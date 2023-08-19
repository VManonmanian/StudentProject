package com.student;

import org.springframework.stereotype.Service;

@Service("seniorStudent")
public class SeniorStudent implements Student {

	@Override
	public String getMessage() {
		System.out.println("hi");
		System.out.println("hello");
		System.out.println("how are you");
		System.out.println("my name is ****");
		// TODO Auto-generated method stub
		return "Implementation of senior student";
	}

}

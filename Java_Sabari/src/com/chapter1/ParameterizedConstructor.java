package com.chapter1;

public class ParameterizedConstructor {
	
	private void student(String s) {
		
		System.out.println(s);

	}
	
	public static void main(String[] args) {
		
		ParameterizedConstructor pc = new ParameterizedConstructor();
		
		pc.student("Hi i am Parameterized Constructor");
	}

}

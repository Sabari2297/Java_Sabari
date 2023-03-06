package com.chapter1;

public class ExceptionDemo {
	
	public static void main(String[] args) {
		
		String s = "Sabari";
		
		System.out.println("Hello");
		
		try {
		
		char charAt = s.charAt(7);
		
		System.out.println(charAt);
		
	}catch (Exception e) {
		
		System.out.println("Exception Find");
	}

}}

package com.chapter1;

public class StringDemo {
	
	public static void main(String[] args) {
		
		String s1 = "Hi";
		
		String s2 = "I am Java";
		
		String s3 = "HI";
		
		char charAt = s2.charAt(5);
		
		System.out.println(charAt);
		
		String concat = s1.concat(s2);
		
		System.out.println(concat);
		
		boolean equals = s1.equals(s3);
		
		System.out.println(equals);
		
		boolean equalsIgnoreCase = s1.equalsIgnoreCase(s3);
		
		System.out.println(equalsIgnoreCase);
		
		int indexOf = s2.indexOf('a');
		
		System.out.println(indexOf);
		
		int lastIndexof = s2.lastIndexOf('a');
		
		System.out.println(lastIndexof);
		}

}

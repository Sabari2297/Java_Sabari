package com.chapter1;

public class StringsDemo1 {
	
	public static void main(String[] args) {
		

		String s1 = "Hi";
		
		String s2 = "I am Java";
		
		String s3 = "HI";
		
		String s4 = " ";
		
		boolean isEmpty = s4.isEmpty();
		
		System.out.println(isEmpty);
		
		boolean isBlank = s4.isBlank();
		
		System.out.println(isBlank);
		
		String toUpperCase = s2.toUpperCase();
		
		System.out.println(toUpperCase);
		
		String toLowerCase = s2.toLowerCase();
		
		System.out.println(toLowerCase);
		
		String[] split = s2.split(" ");
		
	    for (int i = 0; i < split.length; i++) {
			
	    	System.out.println(split[i]);
		}
	}

}

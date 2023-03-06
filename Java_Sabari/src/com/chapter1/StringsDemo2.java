package com.chapter1;

public class StringsDemo2 {
	
	public static void main(String[] args) {
		
        String s1 = "Hi";
		
		String s2 = "I am Java";
		
		String s3 = "HI";
		
		String s4 = " ";
		
		boolean contains = s1.contains("hi");
		
		System.out.println(contains);
		
		String replace = s2.replace("am","was");
		
		System.out.println(replace);
		
		boolean startsWith = s2.startsWith("I");
		
		System.out.println(startsWith);
		
		boolean endsWith = s2.endsWith("va");
		
		System.out.println(endsWith);
	}

}

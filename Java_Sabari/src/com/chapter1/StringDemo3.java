package com.chapter1;

public class StringDemo3 {
	
	public static void main(String[] args) {
		
		String s = "Java";
		
		String s1 = "Welcome to Java";
		
		String s2 = "Java";
		
		int identityHashCode = System.identityHashCode(s);
		
		int identityHashCode1 = System.identityHashCode(s1);
		
		int identityHashCode2 = System.identityHashCode(s2);
		
		System.out.println(identityHashCode);
		
		System.out.println(identityHashCode1);
		
		System.out.println(identityHashCode2);
		
		String concat = s.concat(s1);
		
		System.out.println(System.identityHashCode(concat));
		
		System.out.println("======Mutable======");
		
		StringBuffer a = new StringBuffer("Java");
		
		StringBuffer a1 = new StringBuffer("Java");
		
		System.out.println(System.identityHashCode(a));
		
		System.out.println(System.identityHashCode(a1));
		
		StringBuffer append = a.append(a1);
		
		System.out.println(System.identityHashCode(append));
	}

}

package com.chapter1;

public class KeywordsDemo {
	
	int a = 150;
	
	public static  void student() {
		
		System.out.println("This is Student method");
		
	}
	
	static {
		
		System.out.println("I am First static block");
		
	}
	static {
		System.out.println("I am Second static block");
	}
	
	
	public static void main(String[] args) {
		
		KeywordsDemo kd = new KeywordsDemo();
		
		kd.student();
	}

}

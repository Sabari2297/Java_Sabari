package com.chapter1;

public class VariablesDemo {
	
	int a = 900;
	
	static int c;
	
	private void test() {
		int b = 40;
		
		int a = 900;
		
		System.out.println(a); 
		System.out.println(b);
	}
	
	public static  void main(String[] args) {
		
		VariablesDemo vd = new VariablesDemo();
		
		vd.test();
		
		System.out.println(c);
		
	}

}

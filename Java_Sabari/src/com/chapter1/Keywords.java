package com.chapter1;

public class Keywords extends KeywordsDemo {
	
	int b = 100;
	
	private void test() {
		System.out.println("Super Class :"+super.a);
		
		System.out.println("Sub class :"+this.b);
	}
	
	
	public static void main(String[] args) {
		
		Keywords a = new Keywords();
		
		a.test();
	}

}

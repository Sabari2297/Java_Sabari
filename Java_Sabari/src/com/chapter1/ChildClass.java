package com.chapter1;

public class ChildClass extends ParentClass{
	
	private void jobDetail() {
		
		System.out.println("Works @ Wipro");
	}
	
	public static void main(String[] args) {
		
		ChildClass c = new ChildClass();
		
		c.jobDetail();
		
		c.bankDetails();
	}

}

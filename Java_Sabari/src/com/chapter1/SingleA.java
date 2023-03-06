package com.chapter1;

public class SingleA extends SingleB {
	
	private void workerDetail() {
		
		System.out.println("Worker Name : Sabarinathan");
	}
	
	public static void main(String[] args) {
		
		SingleA sa = new SingleA();
		
		sa.workerDetail();
		
		sa.salaryDetail();
		
		sa.creditDetail();
	}

}

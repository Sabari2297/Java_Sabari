package com.chapter1;

public class ForLoop {
	
	public static void main(String[] args) {
		
		for (int i = 1; i <=5; i++) {
			
			for (int s = 0; s <=5-i; s++) {
				
				System.out.print(" ");
				
			}
			
			for (int j = 1; j <=i; j++) {
				
				System.out.print("*");
				
			}
			
			System.out.println();
		}
	}

}

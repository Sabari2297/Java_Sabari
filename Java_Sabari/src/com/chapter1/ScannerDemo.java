package com.chapter1;

import java.util.Scanner;

public class ScannerDemo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the first name:");
		
		String a = sc.next();
		
		System.out.println("enter the second name:");
		
		String b = sc.next();
		
		
		String result = a+b;
		
		System.out.println("Full name is"+result);
	}

}


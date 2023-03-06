package com.chapter1;

public class ArrayDemo {
	
	public static void main(String[] args) {
		
		int a[] = new int[5];
		
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		
		System.out.println(a[0]);
		
		System.out.println(a[1]);
		
		System.out.println(a[2]);
		
	    System.out.println("++++++Length++++++");
	    
	    int length = a.length;
	    
	    System.out.println(length);
	    
	    System.out.println("+++++ForLoop+++++");
	    
	    for (int i = 0; i < a.length; i++) {
	    	
	    	//i=0;0<5;
	    	//i=1;1<5;
	    	
	    	System.out.println(a[i]);
			
		}
	    
	    int[] s = a.clone();
	    
	    s[3]=600;
	    
	    for (int i : s) {
	    	
	    	System.out.println(i);
			
		}
	}

}

package com.chapter1;

public class MethodOverLoading {
	
	public void player(String s) {
		
		System.out.println("Player Name : "+s);
	}
	
	public void player(int i) {
		
		System.out.println("Player Age : "+i);
		
	}
	
	public void player(int i,String s) {
		
		System.out.println("Player Rank : "+i);
		
	}
	
	public static void main(String[] args) {
		
		MethodOverLoading mo = new MethodOverLoading();
		
		mo.player("Ajay");
		
		mo.player(25);
		
		mo.player(01);
	}

}

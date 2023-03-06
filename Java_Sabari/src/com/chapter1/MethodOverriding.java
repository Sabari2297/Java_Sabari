package com.chapter1;

public class MethodOverriding extends MethodOverLoading {
	
	@Override
	public void player(String s) {
		
		
		
		super.player(s);
	}
		
	public static void main(String[] args) {
		
		MethodOverriding mo = new MethodOverriding();
		
		mo.player("Arjun");
		
		
	}

}

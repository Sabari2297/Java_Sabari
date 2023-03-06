package com.chapter1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsDemo1 {
	
	public static void main(String[] args) {
		
		Set<Integer> s = new TreeSet<>();		
		s.add(500);
		
		s.add(600);
		
		s.add(700);
		
		s.add(600);
		
		
		
		s.add(800);
		
	
		
		int size = s.size();
		
		System.out.println(size);
		
		boolean contains = s.contains(900);
		
		System.out.println(contains);
		
		System.out.println(s);
	}

}

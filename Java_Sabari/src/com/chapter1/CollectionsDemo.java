package com.chapter1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionsDemo {
	
	public static void main(String[] args) {
		
	List<Integer> li = new LinkedList<>();
	
	li.add(1000);
	
	li.add(2000);
	
	li.add(3000);
	
	li.add(4000);
	
	li.add(null);
	
	li.add(2000);
	
	li.add(null);
	
	System.out.println(li);
	
	int size = li.size();
	
	System.out.println(size);
	
	boolean contains = li.contains(5000);
	
	System.out.println(contains);
	
	int remove = li.remove(3);
	
	List<Integer> li1 = new ArrayList<>();
	
	li1.add(500);
	
	li1.add(600);
	
	li1.add(700);
	
	li.addAll(li1);
	
	System.out.println(li);
	}

}

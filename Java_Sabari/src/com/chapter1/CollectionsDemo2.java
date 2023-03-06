package com.chapter1;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CollectionsDemo2 {
	
	public static void main(String[] args) {
		
		Map<String, Integer> m = new TreeMap<>();
		
		m.put("Tamil", 80);
		
		m.put("English", 90);
		
		m.put("Maths", null);
		
		m.put("Sceience", 95);
		
		m.put("Social", null);
		
		System.out.println(m);
		
		int size = m.size();
		
		System.out.println(size);
		
		
		
	}

}

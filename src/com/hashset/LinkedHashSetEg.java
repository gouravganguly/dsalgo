package com.hashset;

import java.util.LinkedHashSet;

public class LinkedHashSetEg {

	
	public static void main(String[] args) {
		addRemove();
	}
	static void addRemove() {
		LinkedHashSet<String> linkedset = new LinkedHashSet<String>();
		
		linkedset.add("a");
		linkedset.add("c");
		linkedset.add("b");
		linkedset.add("d");
		
		boolean val = linkedset.add("a");
		linkedset.add("e");
		
		System.out.println(val);
		System.out.println("Size of LinkedHashSet = " + linkedset.size());   
		System.out.println("Original LinkedHashSet:" + linkedset);   
		System.out.println("Removing D from LinkedHashSet: " + linkedset.remove("d"));   
		System.out.println("Trying to Remove Z which is not present: " + linkedset.remove("Z"));   
		System.out.println("Checking if A is present=" +  linkedset.contains("a")); 
		System.out.println("Updated LinkedHashSet: " + linkedset);
		
	}

}

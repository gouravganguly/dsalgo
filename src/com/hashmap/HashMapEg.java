package com.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEg {

	public static void main(String[] args) {
		
		//printElements();
		printFreq();
	}
	
	//Printing Elements of HashMap String and Integer
	static void printElements() {
		Map <String, Integer> hm = new HashMap<String, Integer>();
		hm.put("a", 100);
		hm.put("b", 200);
		hm.put("c", 300);
		hm.put("d", 400);
		
		Set < Map.Entry< String, Integer> > st = hm.entrySet();
		
		for (Map.Entry<String, Integer> me:st) {
			System.out.print(me.getKey());
			System.out.println(me.getValue());
		}
	}
	
	//Printing frequency of elements in an array
	static void printFreq() {
		int arr[] = {10, 34, 5, 10, 3, 5, 10};
		
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		
		for(int i=0; i<arr.length; i++) {	
			
			Integer c = hmap.get(arr[i]);
		//	System.out.println(c);
			if(hmap.get(arr[i]) == null)
				hmap.put(arr[i], 1);
			else 
				hmap.put(arr[i], ++c);
		}
		
		for(Map.Entry m: hmap.entrySet())
			System.out.println("Frequency of "+ m.getKey() + " is "+m.getValue());
		
	}

}

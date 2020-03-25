package com.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

}

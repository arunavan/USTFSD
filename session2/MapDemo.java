package com.ust.session2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {
	public static void main(String[] args) {
		//Map<Integer,String> map=new LinkedHashMap<>();/random
		Map<Integer,String> map=new HashMap<>(); //orderd
		//Map<Integer,String> map=new TreeMap<>(); //sorted
		
		map.put(61, "java");
		map.put(23, "oracle");
		map.put(33,"spring");
		map.put(23, "db2");
		map.put(33,"restwebsrevices");
		map.put(null, null);
		map.put(32,null);
		System.out.println(map);

		Set keys=map.keySet();
		System.out.println(keys);
		
		Collection values=map.values();
		System.out.println(values);
		
		Set kv=map.entrySet();
		Iterator i=kv.iterator();
		while(i.hasNext()) {
			Map.Entry entry=(Map.Entry)i.next();
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}
		

	}
}

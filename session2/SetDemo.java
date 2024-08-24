package com.ust.session2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class SetDemo {
	public static void main(String[] args) {
		//Set<Integer> list=new HashSet<>();
	//	Set<Integer> list=new LinkedHashSet<>();
		Set<Integer> list=new TreeSet<>();
  		list.add(99);
		list.add(23);
		list.add(56);
		list.add(45);
		list.add(99);
		list.add(45);
		list.add(56);
		list.add(99);
		list.remove(2);
		//list.clear();
		list.contains(45);
		System.out.println(list);
		System.out.println(list.size());
		//System.out.println(list.indexOf(99));
		//System.out.println(list.lastIndexOf(56));
		List list2=Arrays.asList(3,2,4);
		list.addAll(list2);
		System.out.println(list);
		//list.removeAll(list2);
		//System.out.println(list);
		//list.retainAll(list2);
		System.out.println(list.containsAll(list2));
			Iterator i=list.iterator();
		while(i.hasNext()) {
			System.out.println("ArrayList element:"+i.next());
		}
		System.out.println("==========for each loop=============");
		for(Object o:list)
			System.out.println(o);
		System.out.println("==========for each method - java8=============");
		list.forEach(x->System.out.println(x));
		}
}

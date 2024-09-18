package com.ust.session2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
public class ArrayListDemo {
	public static void main(String[] args) {
		//List<Integer> list=new ArrayList<>();
		//List<Integer> list=new LinkedList<>(); // orderd
		List <Integer> list=new Vector<>(); // slow , mutithreading
		
		list.add(23);
		list.add(45);
		list.add(56);
		list.add(99);
		list.add(45);
		list.add(56);
		list.add(99);
		list.remove(2);
		//list.clear();
		list.contains(45);
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.indexOf(99));
		System.out.println(list.lastIndexOf(56));
		
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
		
		Stack s=new Stack();
		s.push(20);
		s.push(45);
		System.out.println(s);
		System.out.println(s.pop());
		
		
	}
}

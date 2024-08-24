package com.ust.session2;

import java.util.Arrays;
import java.util.List;

class Box<T>{
	T t;
	T getT(){
		return t;
	}
	void SetT(T t) {
		this.t=t;
	}
}
public class GenericDemo {

	public static void main(String[] args) {

       Box<Integer> ibox=new Box<>();
       ibox.SetT(10);
       System.out.println(ibox.getT());
       
       Box<String> sbox=new Box<>();
       sbox.SetT("java");
       System.out.println(sbox.getT());
       
       List list=Arrays.asList(3,2,4,5);
       
       Box<List> listbox=new Box<>();
       listbox.SetT(list);
       System.out.println(listbox.getT());
       

	}

}

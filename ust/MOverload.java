package com.ust;

//funciton name is same, signature id diff( number args, datatype , order)
//static poli
public class MOverload {
	void area(int s) {
		System.out.println("Square:"+(s*s));
	}
	
	void area(int l,int b) {
		System.out.println("Rect:"+(l*b));
	}
	void area(double r) {
		System.out.println("circle:"+(3.142*r*r));
	}
	public static void main(String[] args) {
		MOverload m=new MOverload();
		m.area(9.8);
		m.area(4);
		m.area(4, 5);

	}

}

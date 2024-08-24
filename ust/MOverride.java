package com.ust;
//overriding, method name, signature is same, dynamic, runtime 
//final - class , method  , variable
//final class cannot be inherited or extended
//final method cannot be overriden
//final variable cannot be modified
//final 
class A{
	//final
	int a=10;
	//final 
	void sq(int s) {
		System.out.println("area:"+(s*s));
		System.out.println(a++);
	}
}
class B extends A{
	@Override
	void sq(int s) {
		System.out.println("perimeter:"+(4*s));
	}
}
public class MOverride {
	public static void main(String[] args) {
		A a=new A();
		a.sq(5);
		a=new B();
		a.sq(5);
	}
}

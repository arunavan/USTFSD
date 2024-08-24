package com.ust.session2;

interface Arith{
	int op(int a,int b);
}

public class LambdaDemo   {

	public static void main(String[] args) {
	
		Arith arith=(a,b)->a+b;
		System.out.println(arith.op(4, 5));
		System.out.println(arith.op(5, 6));
		
		Arith arith1=(a,b)->a*a-b*b;
		System.out.println(arith1.op(4, 5));
		

	}

}

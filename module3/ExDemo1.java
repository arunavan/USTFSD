package com.ust.module3;

public class ExDemo1 {

	public static void main(String[] args) {
		//1
	
		int a=10;
		int b=0;
		
		
		
		int x[]= {4,3,5};
		try {
			try {
			int c=a/b;
			System.out.println("result:"+c);
			}
			catch (ArithmeticException e) {
				e.printStackTrace();
				//System.out.println(e.getMessage());
			}
			System.out.println(x[4]);
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			//System.out.println(e.getMessage());
		}
		
		
		System.out.println("Done");
		
	}

}

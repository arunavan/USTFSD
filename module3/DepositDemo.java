package com.ust.module3;

public class DepositDemo {

	public static void main(String[] args) throws DepositException{
		
		int amt=1999;
		
		if(amt<1000)
			throw new DepositException("Monimum amount is 1000/-");
		else
			System.out.println("Done.....");

	}

}

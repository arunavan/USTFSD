package com.ust;

public class CustomerDemo {
	public static void main(String[] args) {
		                      //JVM  1- default constructor
		Customer customer=new Customer(); 
		customer.show();
		Customer customer1=new Customer(102,"kiran","kiran@gmail.com"); 
		customer1.show();
		Customer customer2=new Customer(103,"vishal"); 
		customer2.show();
		Customer customer3=new Customer("Sita","sita@gmail.com"); 
		customer3.show();
	}
}

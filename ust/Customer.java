package com.ust;
public class Customer{
	public  Integer cid;//available in all all classes in all packages
	protected String name;  // all classe sin same pack
	private String email;
	int age;  //default
	public  Customer() { //2 no arg constructor
		 cid=101;
		 name="ram";
		 email="ram@gmail.com";
	 }
	 public Customer(Integer cid, String name, String email) {//3 parameterized 
		this.cid = cid;
		this.name = name;
		this.email = email;
	}
	public Customer(Integer cid, String name) {
			this.cid = cid;
		this.name = name;
	}
	public Customer(String name, String email) {
		this.name = name;
		this.email = email;
	}
  void show() {
		 System.out.println(cid+"  "+name+"  "+email);
	 }
}
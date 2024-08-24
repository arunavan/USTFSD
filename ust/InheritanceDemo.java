package com.ust;

class OnlineCustomer extends Customer{
	//cid,name,email
	String city;
	String mobile;
	String type;
	String name;
	public OnlineCustomer(String city, String mobile, String type) {
		//super();
		super(102,"raj","raj@gmail.com");
		this.city = city;
		this.mobile = mobile;
		this.type = type;
		this.name="Gold";
	}
	void dispOnlineDetails() {
		System.out.println(city+"  "+ mobile+"  "+type);
		System.out.println(this.name+"  "+super.name);
	}
}


public class InheritanceDemo {

	public static void main(String[] args) {
		OnlineCustomer cust1=new OnlineCustomer("hyd","9878675645","Silver");
		cust1.show();
		cust1.dispOnlineDetails();
		System.out.println(cust1.cid+"  "+cust1.name+cust1.age+"    "+cust1.city+"  "+cust1.mobile);
		
	}

}

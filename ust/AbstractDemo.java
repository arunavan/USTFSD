package com.ust;
//abstraction, 
abstract class Vehicle{
	abstract void speed();
	abstract int milage();
}


class Car extends Vehicle{
	void speed() {
		System.out.println("speed is 80kmph");
	}
	int milage() {
		return 10;
	}
}
class Bike extends Vehicle{
	void speed() {
		System.out.println("speed is 100kmph");
	}
	int milage() {
		return 60;
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
		Vehicle v;
		v=new Car();
		// calling from car
		System.out.println(v.milage());
		v.speed();
		//dynamic binding, polimorphism
		v=new Bike();
		System.out.println(v.milage());
		v.speed();

	}

}

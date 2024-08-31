package com.ust.module3.threads;



class T1 extends Thread{  //child
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
public class ThreadDemo1 {

	public static void main(String[] args) { //JVM
		
		T1 t1=new T1();
		t1.start();  //calling thread
		
		System.out.println(Thread.activeCount());
		System.out.println(Thread.currentThread().getName());

	}

}

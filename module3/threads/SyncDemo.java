package com.ust.module3.threads;
class CallMe{
	public  synchronized void show(String msg) {
		try {
			System.out.print("[");
			System.out.print(msg);
			Thread.sleep(1000);
			System.out.println("]");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
class Caller extends Thread {
	CallMe cm;
	String msg;
	Caller(CallMe cm,String msg) {
		this.cm=cm;
		this.msg=msg;
		this.start();
	}
	public void run() {
		cm.show(msg);
	}
}

public class SyncDemo {

	public static void main(String[] args) {
		CallMe cm1=new CallMe();
		Caller c1=new Caller(cm1,"UST User1");
		Caller c2=new Caller(cm1,"UST User2");
		Caller c3=new Caller(cm1,"UST User3");
		

	}

}

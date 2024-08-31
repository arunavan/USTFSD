package com.ust.module3.threads;


class T2 implements Runnable{  //child
	public void run() {
		try {
			for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName());
			Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class ThreadDemo2 {

	public static void main(String[] args) { //JVM
		
		T2 t1=new T2();
		Thread tt=new Thread(t1);
		tt.start();  //calling thread
		tt.setName("Producer");
		tt.setPriority(1);
		tt.yield();
		System.out.println(Thread.activeCount()  + tt.getPriority());
		try {
			for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName());
			Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				tt.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

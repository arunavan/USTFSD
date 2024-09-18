package com.ust.module3;
import java.io.FileNotFoundException;
import java.io.FileReader;

class Y{
	void dis() throws FileNotFoundException,InterruptedException{
		ThrowsDemo th=new ThrowsDemo();
		th.show();
	
}
class X extends Y{
	void dis() throws FileNotFoundException {
		
	}
		
	}
	
}
public class ThrowsDemo {
	void show() throws FileNotFoundException,InterruptedException {
		FileReader f=f=new FileReader("C:\\javaworkspace\\App1\\src\\com\\ust\\module3\\ExDemo1.java");
		Thread.sleep(500);
	}
	public static void main(String[] args) throws FileNotFoundException ,InterruptedException
	{
		ThrowsDemo  th =new ThrowsDemo ();
		th.show();

	}

}

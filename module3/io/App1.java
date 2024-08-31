package com.ust.module3.io;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
public class App1 {
	public static void main(String[] args) throws IOException 
	{	//FileInputStream f1=new FileInputStream("C:\\Users\\VINOD\\Downloads\\UST\\Java Module\\strings.txt");
		FileReader f1=new FileReader("C:\\Users\\VINOD\\Downloads\\UST\\Java Module\\ust.txt");
		BufferedReader b1=new BufferedReader(f1);
	/*
	    int k;
		while( (k=f1.read())!= -1)
		{
			System.out.print((char)k);
		}
		*/
		String line=null;
		while((line=b1.readLine())!=null) {
			System.out.println(line);
		}
		f1.close();
	}
}

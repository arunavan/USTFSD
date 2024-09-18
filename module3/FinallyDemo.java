package com.ust.module3;

import java.io.FileReader;
import java.io.IOException;

public class FinallyDemo {

	public static void main(String[] args) {
		
		
		FileReader f=null;
		
		try {
			f=new FileReader("C:\\javaworkspace\\App1\\src\\com\\ust\\module3\\ExDemo1.java");
			//...
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		finally {
		try {
			f.close();
		} catch (IOException e)
        {
			e.printStackTrace();
		}

		}
	}

}

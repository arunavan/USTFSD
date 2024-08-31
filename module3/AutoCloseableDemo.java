package com.ust.module3;

import java.io.FileReader;
import java.io.IOException;


class AutoCloseableDemo{
public static void main(String[] args) {
// try with resource 1.7 , no need of finally
try(FileReader f=new FileReader("C:\\javaworkspace\\App1\\src\\com\\ust\\module3\\ExDemo1.java");) {
	
	///
  } //multi catch block
  catch(IOException | ArithmeticException  | ArrayIndexOutOfBoundsException e) {
	  e.printStackTrace();
   }
  

}

}
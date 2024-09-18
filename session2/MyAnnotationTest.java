package com.ust.session2;

import java.lang.reflect.Method;
import java.util.Date;

class A{
	void show() {
		
	}
}

class B extends A{
	@Override
	void show() {
		
	}
}
public class MyAnnotationTest {
	@SuppressWarnings("deprecation")
	void show() {
		Date d=new Date();
		System.out.println(d.getDate());
	}
	    public static void main(String[] args) throws NoSuchMethodException {
	         Class<MyClass> x = MyClass.class;
            Method method = x.getMethod("myAnnotatedMethod");
          if (method.isAnnotationPresent(MyCustomAnnotation.class)) {
	            MyCustomAnnotation annotation = method.getAnnotation(MyCustomAnnotation.class);
          String value = annotation.value();
	            int count = annotation.count();
	            System.out.println("Annotation value: " + value);
	            System.out.println("Annotation count: " + count);
	        }
	    }
	}
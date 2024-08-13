package day1;

public class ArrayDemo {

	public static void main(String[] args) {

		int a[]= {4,3,2,6,7,8,9};
		
		System.out.println(" for loop ====");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+ " ");
		System.out.println();
		System.out.println(" enhanced for loop ====");
		for(int x:a)
			System.out.print(x+  " ");
	}
}

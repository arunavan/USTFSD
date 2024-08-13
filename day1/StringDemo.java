package day1;

public class StringDemo {

	public static void main(String[] args) {
		
		//immutable  , heap memory,string constant pool
		String s=new String("java");  //String object
		String s1="java"; //literal
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s.equals(s1));
		System.out.println(s==s1);
		System.out.println(s.length());
		System.out.println(s.concat("language"));
		System.out.println(s.replace("a","e")  + " "+s.toLowerCase()   +"  "+s.toUpperCase());
		//mutable
		StringBuffer sb=new StringBuffer("python");
		System.out.println(sb.append("technology"));
		System.out.println(sb.capacity());
		sb.ensureCapacity(50);
		System.out.println(sb.capacity());
		System.out.println(sb);
		System.out.println(sb.insert(2, "xxx"));
		System.out.println(sb.delete(4, 8));
		System.out.println(sb.reverse());

	}

}

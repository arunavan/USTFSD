package com.ust.session2;
import java.util.Objects;
//import java.lang.Object;    equals(),hashCode(),getClass(),toString(),wait(),notify(),notifyAll()
                                //finalize -before gc
//clone
class Student implements Cloneable{
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}
	Integer id;
	String name;
	public Student(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	protected void finalize(){
		id=0;
		name=null;
	}
	
	public Object clone()  throws CloneNotSupportedException{
		return super.clone();
		
	}
	
	
}
public class ObjectDemo {

	public static void main(String[] args) throws CloneNotSupportedException{
		Student s=new Student(10,"Ram");
		Student s1=new Student(10,"Ram");
		
		System.out.println(s.getClass());
		
		System.out.println(s.hashCode()  +"  "+s1.hashCode());
		System.out.println(s.equals(s1));
		System.out.println(s1);//toString()
		
		Student ss1=new Student(102,"RamKumar");
		Student ss2=(Student)ss1.clone();
		System.out.println(ss2.name  +"  "+ss2.id);

	}

}

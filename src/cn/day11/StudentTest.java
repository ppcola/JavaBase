package cn.day11;

public class StudentTest {
	public static void main(String[] args) {
		 Student s1 = new Student();
		 System.out.println(s1.hashCode());
		 
		 Student s = new Student();
		 Class c = s.getClass();
	}
}

class Student extends Object{ 
	
}
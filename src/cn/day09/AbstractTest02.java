package cn.day09;

public class AbstractTest02 {
	public static void main(String[] args) {
		Student s = new BasicStudent();
		s.setAge(18);
		s.setName("wang");
		s.setGrand("二年级");
		System.out.println(s.getAge()+s.getName());
		s.eat();
		s.study();
	}
}

abstract class Student{
	private String name;
	private int age;
	private String grand;
	public Student() {}
	public Student(String name,int age,String grand) {
		this.name = name;
		this.age = age;
		this.grand = grand;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGrand() {
		return grand;
	}
	public void setGrand(String grand) {
		this.grand = grand;
	}
	
	public abstract void study();
	public void eat() {
		System.out.println("student to eat");
	}
}

class BasicStudent extends Student{
	public BasicStudent() {}
	public BasicStudent(String name,int age,String grand) {
		super(name,age,grand);
	}
	public void study() {
		System.out.println("BasicStudent study.");
	}
}

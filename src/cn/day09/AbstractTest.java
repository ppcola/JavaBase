package cn.day09;

public class AbstractTest {
	public static void main(String[] args) {
		Teacher t = new BasicTeacher();
		t.setAge(18);
		t.setName("Tom");
		System.out.println(t.getAge()+t.getName());
		t.teach();
	}
}

abstract class Teacher{
	private String name;
	private int age;
	public Teacher() {
		
	}
	public Teacher(String name,int age) {
		this.name = name;
		this.age = age;
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
	
	//抽象方法
	public abstract void teach();
}

class BasicTeacher extends Teacher{
	public BasicTeacher() {
		
	}
	public BasicTeacher(String name,int age) {
		super(name,age);
	}
	public void teach() {
		System.out.println("BasicTeacher teach JavaSE");
	}
}

class WorkTeacher extends Teacher{
	public WorkTeacher() {}
	public WorkTeacher(String name,int age) {
		super(name,age);
	}
	public void teach() {
		System.out.println("WorkTeach teach JavaEE");
	}
}

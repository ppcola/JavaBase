package cn.day08;

public class ExtendsDemo {
	public static void main(String[] args) {
		Student s = new Student();
		s.sleep();
	}
}

class Person{
	public void eat() {
		System.out.println("吃饭");
	}
	public void sleep() {
		System.out.println("睡觉");
	}
}

class Student extends Person{}


class Teacher extends Person{}
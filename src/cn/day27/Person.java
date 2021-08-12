package cn.day27;

public class Person {
	private String name;
	int age;
	public String address;
	
	public Person() {}
	
	Person(String name,int age,String address){
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public void show() {
		System.out.println("show");
	}
	public void method(String s) {
		System.out.println("method"+s);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	
}

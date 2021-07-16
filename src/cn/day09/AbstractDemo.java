package cn.day09;

public class AbstractDemo {
	public static void main(String[] args) {
		//多态实例化抽象类
		Animal a = new Cat();
	}
}

abstract class Animal{
	
	//抽象类方法不能有主体
	public abstract void eat();
}

abstract class Dog extends Animal{
	
}
class Cat extends Animal{
	public void eat() {
		System.out.println("");
	}
}

package cn.day08;

public class ExtendsDemo02 {
	public static void main(String[] args) {
		Son s = new Son();
		s.show();
		s.method();
	}
}

class GranFather{
	public void show() {
		System.out.println("i am grandFather");
	}
}

class Father extends GranFather{
	public void method() {
		System.out.println("i am father");
	}
}
class Son extends Father{
	
}
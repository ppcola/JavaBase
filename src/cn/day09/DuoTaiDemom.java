package cn.day09;

public class DuoTaiDemom {
	public static void main(String[] args) {
		Fu f =new Zi();
		System.out.println(f.num);
	}
}

class Fu{
	public int num = 100;
	
	public void show() {
		System.out.println("show Fu");
	}
	
}

class Zi extends Fu{
	public int num = 1000;
	public int num2 = 200;
	
	public void show() {
		System.out.println("show Zi");
	}
}
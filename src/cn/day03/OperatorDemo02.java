package cn.day03;

public class OperatorDemo02 {
	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		
		//先把值赋给变量，本身再自增或自减
//		int c = a++;
//		int d = b--;
		
		//本身先自增或自减，再赋值
		int c = ++a;
		int d = --b;
		
		
		
		System.out.println("a:"+a);//4 ,4
		System.out.println("b:"+b);//3 ,3
		System.out.println("c:"+c);//3 ,4
		System.out.println("d:"+d);//4 ,3
	}
}

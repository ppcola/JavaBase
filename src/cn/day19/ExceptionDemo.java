package cn.day19;

public class ExceptionDemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 0 ;
		try {
		System.out.println(a/b);
		}catch (Exception e) {
			System.out.println("err");
		}finally {
			System.out.println("finally");
		}
		
		System.out.println("Over");
	}
}

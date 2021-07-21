package cn.day12;

public class StringDemo03 {
	public static void main(String[] args) {
		String s1 = "helloworld";
		String s2 = "helloworld";
		String s3 = "Helloworld";
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.length());
		System.out.println("----");
		
		System.out.println(s1.charAt(7));
		System.out.println("-----");
		
		System.out.println(s1.indexOf('l'));
	}
}

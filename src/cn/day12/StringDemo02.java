package cn.day12;

public class StringDemo02 {
	public static void main(String[] args) {
		String s1 = new String("Hello");
		String s2 = "Hello";
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
}

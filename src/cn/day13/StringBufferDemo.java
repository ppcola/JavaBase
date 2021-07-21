package cn.day13;

public class StringBufferDemo {
	public static void main(String[] args) {
		String s = "hello";
		
		StringBuffer sb = new StringBuffer(s);
		
		System.out.println(sb);
		
		StringBuffer sb2 = new StringBuffer();
		sb2.append(s);
		System.out.println(sb2);
		
		StringBuffer buffer = new StringBuffer("Java");
		System.out.println(buffer);
	}
}

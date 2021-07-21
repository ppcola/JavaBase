package cn.day12;

public class StringDemo {
	public static void main(String[] args) {
		//public String():空构造 
		String s1 = new String();
		System.out.println("s1:"+s1);
		System.out.println(s1.length());
		
		System.out.println("----------");
		//public String(byte[] bytes):把字节数组转成字符串
		byte[] bys = {97,45,46,76,21,100,8,};
		String s2 = new String(bys);
		System.out.println(s2);
		
	}
}

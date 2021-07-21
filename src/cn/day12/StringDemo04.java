package cn.day12;

public class StringDemo04 {
	public static void main(String[] args) {
		
		String s = "JavaSE";
		//把字符串转成字节数组
		byte[] bys = s.getBytes();
		for(int i = 0 ;i < s.length();i ++) {
			System.out.println(bys[i]);
		}
		System.out.println("-------");
		//把字符串转成字符数组
		char[] chs = s.toCharArray();
		for(int i = 0 ; i < s.length();i ++) {
			System.out.println(chs[i]);
		}
	}
}

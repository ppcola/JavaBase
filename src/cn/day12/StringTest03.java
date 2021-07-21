package cn.day12;
/**
 * 将字符第一个字母大写，其余字母小写
 * @author xi
 *
 */
public class StringTest03 {
	public static void main(String[] args) {
		String s = "helloWORLD";
		
		String s1 = s.substring(0, 1);
		String s2 = s.substring(1);
		
		String s3 = s1.toUpperCase();
		String s4 = s2.toLowerCase();
		
		String s5 = s3.concat(s4);
		System.out.println(s5);
	}
}

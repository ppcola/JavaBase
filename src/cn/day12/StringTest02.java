package cn.day12;
/**
 * 统计一个字符串中大写字母字符，小写字母字符，数字字符出现的次数
 * @author xi
 *
 */
public class StringTest02 {
	public static void main(String[] args) {
		int bigCount = 0;
		int smallCount = 0;
		int numCount = 0;
		
		String s = "Hello123World";
		
		for (int i = 0;i<s.length();i ++) {
			char ch =s.charAt(i);
			
			if(ch >= 'a' && ch <= 'z') {
				smallCount ++;
			}else if(ch >= 'A' && ch <= 'Z') {
				bigCount++;
			}else if (ch >= 0 && ch <= '9') {
				numCount++;
			}
		}
		
		System.out.println(bigCount);
		System.out.println(smallCount);
		System.out.println(numCount);
	}
}

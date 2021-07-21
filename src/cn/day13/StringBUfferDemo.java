package cn.day13;

/*
 * 线程安全
 * StringBuffer线程安全的可变字符串
 * 
 * StringBuffer和String的区别
 * 前者长度和内容可变，后者不可变
 * 如果使用前者做字符串的拼接，不会浪费太多的资源
 */
public class StringBUfferDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();

		StringBuffer sb2 = sb.append("Hello");
		System.out.println(sb + "\n" + sb2);

		System.out.println(sb == sb2);
	}
}

package cn.day13;

public class StringBuffer01 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		
		sb.append("我爱林青霞");
		
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}
}

package cn.day12;

import java.util.Scanner;

/*
 * 字符串反转
 */
public class StringTest06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串");
		String line = sc.nextLine();
		
		String result = "";
		char[] chs = line.toCharArray();
		for(int i =chs.length-1;i >= 0 ; i--) {
			result += chs[i];
			
		}
		
		System.out.println(result);
	}
}

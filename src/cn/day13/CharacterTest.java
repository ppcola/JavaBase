package cn.day13;

import java.util.Scanner;

public class CharacterTest {
	public static void main(String[] args) {
		int bigCount = 0;
		int smallCount = 0;
		int numCount = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String line = sc.nextLine();
		// 把字符串转换为字符数组
		char[] chs = line.toCharArray();

		for (int i = 0; i < chs.length; i++) {
			char ch = chs[i];
			if(Character.isUpperCase(ch)) {
				bigCount++;
			}else if(Character.isLowerCase(ch)) {
				smallCount++;
			}else if(Character.isDigit(ch))  {
				numCount++;
			}
		}
		System.out.println(bigCount);
	}
}

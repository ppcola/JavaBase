package cn.day03;

import java.util.Scanner;

/**
 * 输入两个数获取最大值
 *
 */
public class ScannerTest02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入第一个数：");
		int a = input.nextInt();
		System.out.println("请输入第二个数：");
		int b = input.nextInt();
		int max =(a > b ? a:b);
		System.out.println("max:"+max);
		
	}
	
	

}

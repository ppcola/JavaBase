package cn.day03;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("请输入第一个数：");
		int x = input.nextInt();
		System.out.println("请输入第二个数：");
		int y = input.nextInt();
		int sum = (x + y);
		System.out.println("sum"+sum);
	}

}

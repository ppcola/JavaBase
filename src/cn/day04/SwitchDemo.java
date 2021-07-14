package cn.day04;

import java.util.Scanner;
public class SwitchDemo {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入一个数(1-7):");
		int week =sc.nextInt();
		
		switch(week) {
		case 1:
			System.out.println("星期一");
			break;
		case 2:
			System.out.println("星期二");
			break;
		case 3:
			System.out.println("星期三");
			break;
		default:
			System.out.println("Err");
			break;
		}
	}

}

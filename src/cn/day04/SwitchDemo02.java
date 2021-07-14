package cn.day04;

import java.util.Scanner;
public class SwitchDemo02 {
	public static void main(String[] args) {
		System.out.println("请输入一个数据(1-7)：");
		Scanner sc = new Scanner(System.in);
		int week = sc.nextInt();
		//case 后面一定要是常量
		final int day =3;
		
		switch(week) {
		case 1:
			System.out.println("星期一");
			break;
		case 2:
			System.out.println("星期二");
			break;
		case day:
			System.out.println("星期三");
			break;
		default:
			System.out.println("Err");
			break;
		}
	}

}

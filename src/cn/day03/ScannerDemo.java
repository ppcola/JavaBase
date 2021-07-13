package cn.day03;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("please input a number:");
		
		int x = input.nextInt();
		
		System.out.println("number:"+x);
		input.close();
	}

}

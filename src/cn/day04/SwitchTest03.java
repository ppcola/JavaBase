package cn.day04;
import java.util.Scanner;
public class SwitchTest03 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("请输入你要判断的字符串：");
		
		String str = sc.nextLine();
		
		switch(str) {
		case "hello":
			System.out.println("你输入的是hello");
			break;
		case "world":
			System.out.println("你输入的是world");
			break;
		case "java":
			System.out.println("你输入的java");
			break;
		default:
			System.out.println("Err");
			break;
		}
	}

}

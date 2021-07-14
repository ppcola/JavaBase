package cn.day04;
/**
 * 模拟单项选择题。
 * 
 *
 */
import java.util.Scanner;
public class SwitchTest02 {
	public static void main(String[] args) {
		System.out.println("下面几个人你最喜欢谁？");
		
		System.out.println("65 林青霞");
		System.out.println("66 张曼玉");
		System.out.println("67 刘德华");
		System.out.println("68 王力宏");
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("请输入你都选择：");
		
		int choiceNumber = (char)(sc.nextInt());
		
		switch(choiceNumber) {
		case 'A':
			System.out.println("yes");
		}
		
	}

}

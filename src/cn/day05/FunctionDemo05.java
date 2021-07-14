package cn.day05;
import java.util.Scanner;
public class FunctionDemo05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入n的值：(1~9)");
		int n = sc.nextInt();
		printNN(n);
	}

	private static void printNN(int n) {
		for(int x = 1; x <= n; x++) {
			for(int y = 1; y <= x; y++) {
				System.out.print(y+"*"+x+"="+y*x+"\t");
			}
			System.out.println("");
		}
	}
	
}

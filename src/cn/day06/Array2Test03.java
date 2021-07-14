package cn.day06;
import java.util.Scanner;
public class Array2Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入一个数据：");
		int n =sc.nextInt();
		
		//定义二维数组
		
		int[][] arr =new int[n][n];
		
		for(int x = 0 ; x < arr.length; x++) {
			for(int y = 0; y < arr[x].length; y++) {
				System.out.print(arr[x][y]+ "\t");
			}
			System.out.println("");
		}
	}
}

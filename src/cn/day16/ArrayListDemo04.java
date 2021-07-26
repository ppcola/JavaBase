package cn.day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListDemo04 {
	public static void main(String[] args) {
		
		Scanner sc = new  Scanner(System.in);
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		while(true) {
			System.out.println("请输入数据：");
			int number = sc.nextInt();
			if(number != 0) {
				array.add(number);
			}else {
				break;
			}
		}
		
		Integer[] myi= new Integer[array.size()];
		array.toArray(myi);
		
		Arrays.sort(myi);
		
		System.out.println("数组是："+arrayToString(myi)+"最大值:"+myi[myi.length-1]);
		
		
	}
	
public static String arrayToString(Integer[] myi) {
	StringBuilder sb = new StringBuilder();
	
	sb.append("[");
	for(int i = 0 ;i< myi.length; i++) {
		if(i == myi.length - 1) {
			sb.append(myi[i]);
		}else {
			sb.append(myi[i]).append(", ");
		}
	}
	sb.append("]");
	
	return sb.toString();
}
}

package cn.day16;
/*
 * 增强for的目标不能为null
 * 
 * 增强for其实是用来替代迭代器的
 */
import java.util.ArrayList;

public class ForDemo {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		for(int i = 0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("----------");
		
		//增强for
		for(int i : arr) {
			System.out.println(i);
		}
		
		System.out.println("----------------");
		
		String[] strArray = {"张明义","风清扬","东方不败"};
		
		for(String str : strArray) {
			System.out.println(str);
		}
		
		System.out.println("----------");
		
		ArrayList<String> myarr = new ArrayList<String>();
		myarr.add("hello");
		myarr.add("world");
		myarr.add("java");
		
		for(String myStr : myarr) {
			System.out.println(myStr);
		}
	}
}

package cn.day16;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo03 {
	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("hello");
		arr.add("world");
		arr.add("java");
		
		//迭代器
		Iterator<String> it = arr.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
		
		System.out.println("--------------");
		//普通for
		
		for(int i = 0 ; i< arr.size();i++) {
			System.out.println(arr.get(i));
		}
		
		System.out.println("--------------");
		
		//增强for
		
		for(String str : arr) {
			System.out.println(str);
		}
	}
}

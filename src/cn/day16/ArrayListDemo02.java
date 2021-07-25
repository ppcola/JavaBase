package cn.day16;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo02 {
	public static void main(String[] args) {

		ArrayList array = new ArrayList();

		array.add("hello");
		array.add("world");
		array.add("java");
		array.add("world");
		array.add("java");
		array.add("world");
		array.add("world");
		array.add("java");
		array.add("world");
		// 选择排序

		for (int i = 0; i < array.size() - 1; i++) {
			for (int j = i + 1; j < array.size(); j++) {
				if(array.get(i).equals(array.get(j))) {
					array.remove(j);
					//j--;
				}
			}
		}
		
		Iterator it = array.iterator();
		while(it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}
	}
}

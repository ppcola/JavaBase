package cn.day15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * List集合的特点：
 * 		有序（存储和取出的元素一致），可重复
 */
public class ListDemo02 {
	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add("hello");
		list.add("world");
		list.add("java");
				list.add("hello");
		list.add("world");
		list.add("java");
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			String s = (String)it.next();
			System.out.println(s);
			
		}
	}
}

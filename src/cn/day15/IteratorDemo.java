package cn.day15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
	public static void main(String[] args) {
		
		Collection c = new ArrayList();
		
		c.add("hello");
		c.add("world");
		c.add("java");
		
		Iterator it = c.iterator();//返回的是子类对象，这里是多态
		/*
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		//System.out.println(it.next()); 超出索引
		 * 
		 */
		
		
		while(it.hasNext()) {
			//System.out.println(it.next());
			String s = (String)it.next();
			System.out.println(s);
		}
		
	}
}

package cn.day16;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		
		ArrayList array = new ArrayList();
		
		array.add("hello");
		array.add("world");
		array.add("java");
		array.add("world");
		array.add("java");
		array.add("world");
		array.add("world");
		
		ArrayList newArrray = new ArrayList();
		
		Iterator it = array.iterator();
		while(it.hasNext()) {
			String s = (String) it.next();
			
			System.out.println(s);
		}
		System.out.println("---------");
		
		for(int i = 0 ; i< newArrray.size();i++) {
			String s = (String) newArrray.get(i);
			System.out.println(s);
		}
	}
}

package cn.day15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo01 {
	public static void main(String[] args) {
		List list = new ArrayList();
		
		Student s1 = new Student("林黛玉",18);
		Student s2 = new Student("刘姥姥",88);
		Student s3 = new Student("王熙凤",38);
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			Student s = (Student)it.next();
			System.out.println(s);
		}
		
		System.out.println("---------");
		
		for(int i = 0 ;i<list.size();i++) {
						Student s = (Student) list.get(i);
			System.out.println(s.getName());
		}
	}
}

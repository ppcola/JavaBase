package cn.day15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		
		Student s1 = new Student("林青霞",23);
		Student s2 = new Student("风清扬",22);
		Student s3 = new Student("令狐冲",23);
		Student s4 = new Student("双喜",23);
		Student s5 = new Student("刘亦菲",22);
		
		//把学生添加到集合
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(s5);
		
		Iterator it = c.iterator();
		
		while(it.hasNext()) {
			
			//System.out.println(it.next());
			Student s = (Student)it.next();
			System.out.println(s.getName()+s.getAge());
		}
	}
}

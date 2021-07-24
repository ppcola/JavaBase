package cn.day15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest02 {
	public static void main(String[] args) {
		
		
		Collection c = new ArrayList();
		
		
		 Student s1 = new Student("双喜",23);
		 Student s2 = new Student("貂蝉",25);
		 Student s3 = new Student("黄月英",21);
		 Student s4 = new Student();
		 s4.setName("大乔");
		 s4.setAge(20);
		 
		 c.add(s1);
		 c.add(s2);
		 c.add(s3);
		 c.add(s4);
		 c.add(new Student("孙尚香",18)); //匿名对象
		 
		 //遍历集合
		 
		 Iterator it = c.iterator();
		 while(it.hasNext()) {
			 Student s = (Student)it.next();
			 System.out.println(s.getName()+s.getAge());
		 }
		 
	}
}

package cn.day15;

import java.util.ArrayList;
import java.util.Collection;

/*
 * 用集合存储5个学生对象，并把学生对象进行便利。
 */
public class StudentDemo {
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
		
		Object[] objs =c.toArray();
		
		for(int i = 0 ; i< objs.length; i++) {
			//System.out.println(objs[i]);输出的地址值
			Student s = (Student)objs[i];
			System.out.println(s.getName()+s.getAge()+"岁");
		}
	}
}

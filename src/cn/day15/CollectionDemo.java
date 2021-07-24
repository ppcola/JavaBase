package cn.day15;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
public static void main(String[] args) {
	Collection c  = new ArrayList();
	
	c.add("hello");
	c.add("hello");
	
	//c.remove("hello");  只移除了一个
	
	//c.clear(); 清除了全部
	
	System.out.println(c.contains("hello"));
	
	System.out.println(c);
}
}

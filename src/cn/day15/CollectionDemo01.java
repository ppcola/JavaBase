package cn.day15;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo01 {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		Collection c2 = new ArrayList();

		c1.add("abc1");
		c1.add("abc2");
		c1.add("abc3");
		c1.add("abc4");

		c2.add("abc4");
		c2.add("abc5");
		c2.add("abc6");
		c2.add("abc7");

		//System.out.println(c1.addAll(c2));
		System.out.println(c1);
		System.out.println(c2);
	}
}


package cn.day15;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo03 {
	public static void main(String[] args) {

		Collection c = new ArrayList();
		c.add("hello");
		c.add("world");
		c.add("java");
		
		Object[] objs = c.toArray();	
		for(int i = 0 ; i< objs.length;i++) {
			//System.out.println(objs[i]);
			
			String str = (String)objs[i];
			System.out.println(str);
		}
	}
}

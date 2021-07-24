package cn.day15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {
	public static void main(String[] args) {

		Collection c = new ArrayList();
		 c.add("林青霞");
		 c.add("风清扬");
		 c.add("双喜");
		 c.add("刘艺");
		 
		 Iterator it = c.iterator();
		 
		 while(it.hasNext()) {
			 String s = (String)it.next();
			 System.out.println(s);
		 }
		 
	}
}

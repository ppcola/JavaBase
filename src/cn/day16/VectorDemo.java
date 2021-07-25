package cn.day16;

import java.util.Vector;

/*
 * Vector
 */
public class VectorDemo {
	public static void main(String[] args) {

		Vector v = new Vector();

		v.addElement("hello");
		v.addElement("world");
		v.addElement("java");

		for (int i = 0; i < v.size(); i++) {
			String s = (String) v.elementAt(i);
			System.out.println(s);
		}
	}
}

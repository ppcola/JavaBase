package cn.test;

import java.util.Hashtable;

public class HashtableDEmo {
	public static void main(String[] args) {
		Hashtable<Integer,String> ht = new Hashtable<Integer, String>();
		ht.put(1, "Jack");
		//ht.put(null, null);
		ht.put(2, "Tom");
		//ht.put(3, null);
		ht.put(1, "john");
		System.out.println(ht);
	}
}

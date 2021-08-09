package cn.test;

import java.util.HashMap;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(1, "Tom");
		hm.put(2, "Jack");
		hm.put(1, "Tom");
		hm.put(null, null);
		System.out.println(hm);
	}
}

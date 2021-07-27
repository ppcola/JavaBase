package cn.day17;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("hello");
		hs.add("java");
		hs.add("world");
		hs.add("java");
		
		for(String str :hs) {
			System.out.println(str);
		}
		
	}
}

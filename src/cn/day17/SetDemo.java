package cn.day17;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>(); 
		
		set.add("hello");
		set.add("java");
		set.add("world");
		set.add("java");
		set.add("world");
		
		for(String str :set) {
			System.out.println(str);
		}
	}
}

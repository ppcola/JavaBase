package cn.day16;

import java.util.Arrays;
import java.util.List;

public class ArraysDemo {
	public static void main(String[] args) {

		String[] strArray = { "hello", "java", "world" };

		List<String> list = Arrays.asList(strArray);

		for (String str : list) {
			System.out.println(str);
		}
	}
}

package cn.day18;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapDemo01 {

	public static void main(String[] args) {
		HashMap<String, HashMap<String, ArrayList<Student>>> czbkMap = new HashMap<String, HashMap<String, ArrayList<Student>>>();

		HashMap<String, ArrayList<Student>> bjCzbkMap = new HashMap<String, ArrayList<Student>>();

		ArrayList<Student> array1 = new ArrayList<Student>();
		Student s1 = new Student("林青霞", 21);
		Student s2 = new Student("风清扬", 30);
		array1.add(s1);
		array1.add(s2);

		ArrayList<Student> array2 = new ArrayList<Student>();
		Student s3 = new Student("赵雅芝", 28);
		Student s4 = new Student("吴昕", 21);
		array2.add(s3);
		array2.add(s4);




	}
}

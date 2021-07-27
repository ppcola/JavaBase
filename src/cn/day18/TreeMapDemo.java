package cn.day18;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap<Student,String> tm = new TreeMap<Student, String>();
		
		
		tm.put(new Student("student1",22), "str1");
		tm.put(new Student("学生2",21), "str1");
		tm.put(new Student("学生3",25), "str1");
		tm.put(new Student("学生2",21), "str1");
		
		System.out.println((new Student("student1",22)).compareTo(new Student("student1",23)));
		
		
	//	tm.entrySet();
		Set<Entry<Student, String>> set =tm.entrySet();
		for(Entry<Student, String> e :set) {
			System.out.println(e.getKey().getName() + "---"+ e.getKey().getAge() + "---" + e.getValue());
		}
		
	}
}

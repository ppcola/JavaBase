package cn.day18;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {

		Map<String,String> m = new HashMap<String,String>();
		
		
		m.put("文章", "马伊琍");
		
	//	m.clear();
		System.out.println(m.isEmpty());
		System.out.println(m.size());
		
		System.out.println(m);
	}
}

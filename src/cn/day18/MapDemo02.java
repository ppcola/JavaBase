package cn.day18;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo02 {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String, String>();
		
		map.put("1", "one");
		map.put("2","two");
		map.put("3", "three");
		
		System.out.println(map.get("1"));
		
		Set<String> set = map.keySet();
		
		for(String str :set) {
			System.out.println(str);
		}
	}
}

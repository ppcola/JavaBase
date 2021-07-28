package cn.day18;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		
		HashMap<String,HashMap<String,Integer>> czbkMap = new HashMap<String, HashMap<String,Integer>>();
		HashMap<String,Integer> jcMap =new HashMap<String, Integer>();
		jcMap.put("陈玉楼", 20);
		jcMap.put("高跃", 22);
		
		czbkMap.put("jc", jcMap);
		
		HashMap<String,Integer> jyMap = new HashMap<String, Integer>();
		
		jyMap.put("李杰", 21);
		jyMap.put("曹",23);
		
		czbkMap.put("jy", jyMap);
		
		Set<String>czbkMapSet = czbkMap.keySet();
		for(String czbkMapKey:czbkMapSet) {
			
			HashMap<String, Integer> czbkMapValue = czbkMap.get(czbkMapKey);

			Set<String> czbkMapValueSet = czbkMapValue.keySet();
			for(String czbkMapValueKey : czbkMapValueSet) {
				Integer czbkMapValueValue = czbkMapValue.get(czbkMapValueKey);
				System.out.println(czbkMapValueKey+"-------"+czbkMapValueValue);
			}
		}
	}
}

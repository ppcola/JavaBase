package cn.day05;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

public class TestDG {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\cheng\\Desktop\\demo.txt");
		List<String> list = TestDG.txt2String(file);
		Set<String> set = new HashSet<String>();
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		TestDG.digui(list, list1, list2, set);
s		for(String str : list1) {
			System.out.println(str);
			
		}
		list = null;
		list1 = null;
		list2 = null;
		set = null;
		
		
	}
	
	
	
	
	/**
	  * 读取txt文件的内容
     * @param file 想要读取的文件对象
     * @return 返回文件内容
     */
    public static List<String> txt2String(File file){
        //StringBuilder result = new StringBuilder();
        List<String> list = new ArrayList<String>();
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));//构造一个BufferedReader类来读取文件
            String s = null;
            while((s = br.readLine())!=null){//使用readLine方法，一次读一行
                //result.append(System.lineSeparator()+s);
            	list.add(s);
            }
            br.close();    
        }catch(Exception e){
            e.printStackTrace();
        }
        return list;//result.toString();
    }

    public static List<String> digui(List<String> list,List<String> list1, List<String> list2,Set<String> set){
    	list2.clear();
    	for(String str : list) {
			String[] strs =str.split("@", -1);
			if(set.contains(strs[1])) {
				list1.add(str);
				set.add(strs[0]);
			}else{
				if(strs[1] == null || "".equals(strs[1])) {
					list1.add(str);
					set.add(strs[0]);
				}else {
					list2.add(str);
				}
			}
		}
    	List<String> listT = new ArrayList<String>();
    	
    	if(!list2.isEmpty()) {
    		listT.addAll(list2);
    		digui(listT, list1, list2, set);
    	}
    	listT = null;
    	
    	return list1;
    }
}

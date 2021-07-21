package cn.day12;
/*
 * 统计大串中小串出现的次数
 */
public class StringTest07 {
	public static void main(String[] args) {
		String str = "sjfkasjdkfaljavajkalsjdjavajkfjajavajkjavasjfjavajk";
		String mystr = "java";
		
		int count = getCount(str, mystr);
		System.out.println(count);
				
 	}
	
	public static int getCount(String str,String mystr) {
		int count = 0;
		int index = str.indexOf(str);
		
		
		while(index != -1) {
			count ++;
			int startIndex = index + mystr.length();
			str = str.substring(startIndex);
			index = str.indexOf(mystr);
		}
		return count;
	}
}

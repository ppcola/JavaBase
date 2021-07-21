package cn.day12;
/**
 * 
 * @author xi
 *
 */
public class StringTest05 {
	public static void main(String[] args) {
		String s ="";
		
		s += "[";
		
		int [] arr= {1,2,3};
		
		for(int i = 0 ; i< arr.length; i++) {
			if(i == arr.length-1) {
				s += arr[i];
				s +="]";
			}else {
				s += arr[i];
				s += ", ";
			}
		}
		System.out.println(s);
	}
}

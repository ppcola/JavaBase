package cn.day05;

public class ArrayDemo06 {
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		
		//System.out.println(arr[3]);
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
		//数组越界异常
		
		arr = null;
		
		System.out.println(arr[0]);
		//java.lang.NullPointerException
		//空指针异常
		
	}

}

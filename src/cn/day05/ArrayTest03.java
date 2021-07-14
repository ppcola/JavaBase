package cn.day05;

public class ArrayTest03 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		reverse(arr);
		System.out.println(arr[0]);
	}
	
	public static void reverse(int[] arr) {
		
		for(int x = 0; x < arr.length/2; x++) {
			int temp = arr[x];
			arr[x] = arr[arr.length -1 -x];
			arr[arr.length-1-x] = temp;
		}
		
	}
}

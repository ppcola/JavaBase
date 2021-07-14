package cn.day05;

public class ArrayTest02 {
	public static void main(String[] args) {
		int[] arr = {34,98,10,25,67};
		
		int max = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}
}

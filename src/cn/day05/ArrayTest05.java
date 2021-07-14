package cn.day05;

public class ArrayTest05 {
	public static void main(String[] args) {
		int[] arr = {200,250,38,888,444};
		
		int index = getIndex2(arr, 250);
		
		System.out.println(index);
	}
	
	public static int getIndex(int[] arr,int value) {
		for(int i = 0; i < arr.length; i ++) {
			if(arr[i] == value) {
				return i;
			}			
		}
		return -1;
	}
	public static int getIndex2(int[] arr,int value) {
		int index = -1;
		
		for(int i = 0 ; i < arr.length; i ++) {
			if(arr[i] == value) {
				index = i;
				break;
			}
		}
		return index;
	}
}

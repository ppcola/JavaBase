package cn.day13;
/*
 * 查找：
 * 		基本查找：数组无顺（从头到尾）
 * 		二分查找（折半查找）：元素有序
 */
public class ArrayDemo02 {
	public static void main(String[] args) {
		int[] arr = {11,22,33,44,55,66,77};
		int index = getIndex(arr, 333);
		System.out.println(index);
	}
	public static int getIndex(int[] arr,int value) {
		int max = arr.length-1;
		int min = 0;
		
		int mid = (max+min)/2;
		
		while(arr[mid]!= value) {
			if(arr[mid] > value) {
				max = mid - 1;
			}else if(arr[mid]<value) {
				min = mid +1; 
			}
			//加入判断
			if(min>max) {
				return -1;
			}
			mid = (max+min)/2;
		}
		return mid;
	}
}

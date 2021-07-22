package cn.day13;

/*
 * 数组排序选择排序
 */
public class ArrayDemo01 {
	public static void main(String[] args) {
		int[] arr = { 24, 69, 80, 57, 13 };
		System.out.println("排序前：");
		ArrayDemo.printArray(arr);
		System.out.println("\n排序后：");

		for (int i = 0; i < arr.length - 1; i++) {
			for(int j = i+1; j< arr.length;j++) {
				if(arr[j] < arr[i]) {
					int tmp = arr[i];
					arr[i]= arr[j];
					arr[j] = tmp;
				}
			}
		}
		ArrayDemo.printArray(arr);
	}
}

package cn.day13;

public class ArrayDemo {
	public static void main(String[] args) {
		int[] arr = { 24, 69, 80, 81, 38 };
		System.out.println("排序前：");
		printArray(arr);
//		// 第一次比较
//		// length-1 是为了防止越界，-0是为了减少比较次数
//		for (int i = 0; i < arr.length - 1 - 0; i++) {
//			if (arr[i] > arr[i + 1]) {
//				int tmp = arr[i];
//				arr[i] = arr[i + 1];
//				arr[i + 1] = tmp;
//			}
//		}
//		System.out.println("第一次比较后：");
//		printArray(arr);
//		// 第二次比较
//		for (int i = 0; i < arr.length - 1 - 1; i++) {
//			if (arr[i] > arr[i + 1]) {
//				int tmp = arr[i];
//				arr[i] = arr[i + 1];
//				arr[i + 1] = tmp;
//			}
//		}
//		System.out.println("第二次比较后：");
//		printArray(arr);
//		// 第3次比较
//		for (int i = 0; i < arr.length - 1 - 2; i++) {
//			if (arr[i] > arr[i + 1]) {
//				int tmp = arr[i];
//				arr[i] = arr[i + 1];
//				arr[i + 1] = tmp;
//			}
//		}
//		System.out.println("第3次比较后：");
//		printArray(arr);
//		// 第4次比较
//		for (int i = 0; i < arr.length - 1 - 3; i++) {
//			if (arr[i] > arr[i + 1]) {
//				int tmp = arr[i];
//				arr[i] = arr[i + 1];
//				arr[i + 1] = tmp;
//			}
//		}
//		System.out.println("第4次比较后：");
//		printArray(arr);
//
//		System.out.println("---------");
		// 循环改进

		for (int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		System.out.println("排序后：");
		printArray(arr);
		
	}

	public static void printArray(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.print(arr[i]);
			} else {
				System.out.print(arr[i] + ", ");
			}
		}
		System.out.print("]");
	}

}

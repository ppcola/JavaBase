package cn.day06;

public class JiaMIDemo {
	public static void main(String[] args) {
		int num = 123456;
		int[] arr = new int[8];
		int index = 0;
		
		while(num > 0 ) {
			arr[index] = num%10;
			index++;
			num /=10;
		}
		
		for(int i = 0; i < index; i++) {
			arr[i] += 5;
			arr[i] %= 10;
		}
		
		int temp = arr[0];
		arr[0] = arr[index - 1];
		arr[index-1] = temp;
		
		for(int str : arr) {
			System.out.println(str);
		}
	}
}

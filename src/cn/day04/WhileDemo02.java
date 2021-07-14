package cn.day04;

public class WhileDemo02 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		int sum2 =0;
		
		int x = 1;
		while(x <= 100) {
			sum2 += x;
			x++;
		}
		System.out.println(sum2);
	}
}

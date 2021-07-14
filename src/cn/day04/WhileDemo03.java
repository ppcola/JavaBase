package cn.day04;

public class WhileDemo03 {

	public static void main(String[] args) {
			int i = 100;
			int count = 0;
	while(i < 1000) {
		int a =  i%10;
		int b = i/10%10;
		int c = i/100%10;
		
		if((a*a*a+b*b*b+c*c*c)==i) {
			count++;
		}
		i++;
	}
	System.out.println(count);
	}

}

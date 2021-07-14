package cn.day04;

public class Demo {
	public static void main(String[] args) {
	
/*		//阶乘
		int result = 1;
		
		for (int i = 1;i <= 5;i ++) {
			result *=i;
		}
		System.out.println(result);
		*/
		
		//水仙花 ：指各位数字的立方和等于该数本身eg：153就是一个水仙花数
		//回文数：对称的数字左右两边的数之和等于中间的数字
		for(int i =100 ;i < 1000; i++) {
			int a = i%10;
			int b = i/10%10;
			int c = i/100%10;
			
			if(i ==(a*a*a+b*b*b+c*c*c)) {
				System.out.println(i);
			}
		}
	}

}

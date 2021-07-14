package cn.day04;

/**
 * for循环和while循环的区别
 *
 */
public class WhileDemo04 {
	public static void main(String[] args) {
		for (int i = 0 ; i < 10; i++) {
			System.out.println("hello");
		}
		//for循环结束后，i变量就不能继续访问了
		//System.out.println(i);
		
		int j =0;
		while(j < 10) {
			System.out.println("HELLO");
			j++;
		}
		
		//变量j可以继续使用
		System.out.println(j);
	}

}

package cn.day03;

/**
 * 交换两个整数
 *
 */

public class OperateTest {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		//方式1，使用第三方变量
		//方式2: 用位异或实现
		
		a = a ^ b;
		b = a ^ b;  //a ^ b ^ b = a
		a = a ^ b;	//a ^ b ^ a = b
		
		System.out.println("a:"+a);
		
		
		//方式3：变量相加
		
		a = a + b; //a = 30
		b = a - b; //b = 10;
		a = a - b; //a = 20;
		
		//方式4:一句话搞定
		
		a = ((a + b )-(a = b));
	}
}

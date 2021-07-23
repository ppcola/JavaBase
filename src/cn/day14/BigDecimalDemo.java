package cn.day14;

import java.math.BigDecimal;

public class BigDecimalDemo {
	public static void main(String[] args) {
		
		/**
		 * 会出问题
		 */
		System.out.println(0.9 + 0.1);
		System.out.println(0.09 + 0.01);

		System.out.println(1.0 - 0.32);
		System.out.println(1.0 - 0.12);
		
		//--------------------
		
		BigDecimal bd1 = new BigDecimal("0.09");
		BigDecimal bd2 = new BigDecimal("0.01");
		
		System.out.println(bd1.add(bd2));
	}
}

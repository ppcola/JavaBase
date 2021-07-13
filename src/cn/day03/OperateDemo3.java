package cn.day03;
/**
 *  <<  : 右移 左边最高位丢弃，右边补齐0
 *  
 *
 */
public class OperateDemo3 {
	public static void main(String[] args) {
		//把左边的数据*2的移动次幂
		System.out.println(3 << 2); //3*2^2 =12
		//把左边的数据/2的移动次幂
		System.out.println(24 >> 2); //24 /2^2
		
		/**
		 * 面试题：
		 * 用最有效率的方式计算2乘以8的结果
		 * 
		 * 2*8
		 * 
		 * 2 << 3
		 */
	}
}

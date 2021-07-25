package cn.day16;

/**
 * 可变参数方法
 */
public class ArgsDemo {
	public static void main(String[] args) {
		System.out.println(sum(1,2,3,4,5,6,7,8));
	}

	public static int sum(int... a) {
		int s = 0;
		for (int i : a) {
			s = s + i;
		}
		return s;
	}
}

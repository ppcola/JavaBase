package cn.day20;

public class DiGuiDemo {
	public static void main(String[] args) {
		System.out.println(jieCheng(5));
	}
	public static int jieCheng(int i) {
		if(i == 1) {
			return 1;
		}else {
			return i * jieCheng(i-1);
		}
		
	}
}

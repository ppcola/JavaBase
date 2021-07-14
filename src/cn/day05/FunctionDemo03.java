package cn.day05;

/**
 * 
 *for循环嵌套输出图形
 */
public class FunctionDemo03 {
	public static void main(String[] args) {
		printStart(3,4);
	}

	private static void printStart(int m ,int n) {
		for(int x = 0; x < m ; x++) {
			for(int y = 0; y < n; y ++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	

}

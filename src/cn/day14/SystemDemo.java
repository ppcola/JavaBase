package cn.day14;

public class SystemDemo {
public static void main(String[] args) {
//	System.out.println("this is the first");
//	System.exit(0);
//	System.out.println("The second");
	
	long start = System.currentTimeMillis();
	for(int i = 0 ; i< 100000;i++) {
		System.out.println("hello"+i);
	}
	long end = System.currentTimeMillis();
	System.out.println("共耗时："+(end-start)+"毫秒");
}
}

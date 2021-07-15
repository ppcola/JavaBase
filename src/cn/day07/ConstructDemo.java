package cn.day07;
/**
 * 构造方法：
 * 		给对象的数据进行初始化
 * 
 * 格式：
 * 		A: 方法名与类名相同
 * 		B:没有返回值
 * 		
 *
 */
public class ConstructDemo {
	public static void main(String[] args) {
		Student s =new Student();
	}
}
class Student{
	public Student() {
		System.out.println("这是构造方法");
	}
}

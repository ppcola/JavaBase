package cn.day27;

/*
 * 反射就是通过class文件对象，去使用该文件中的成员变量，构造方法，成员方法
 * 
 * Person p = new Person（）；
 * p.使用
 * 
 * 
 */
public class ReflectDemo {
	public static void main(String[] args) throws ClassNotFoundException {
		Person p = new Person();
		Class c = p.getClass();
		
		Person p2 = new Person();
		Class c2 = p2.getClass();
		
		System.out.println(p == p2);//false
		System.out.println(c == c2);//true
		
		Class c3 = Person.class;
		
		System.out.println(c ==c3);
		
		Class c4 = Class.forName("cn.day27.Person");
		
		System.out.println(c == c4);
	}
}

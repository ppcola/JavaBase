package cn.day14;

public class Person {
	public static void main(String[] args) {
		Person p = new Person("孙燕姿",20);
		System.out.println(p);
		
		p =  null; //让p 不再指定堆内存
		System.gc();
	}
	private String name;
	private int age;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("当前的对象被回收了"+this);
		super.finalize();
	}
	 
	
}

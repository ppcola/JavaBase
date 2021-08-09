package cn.day24;

public class SetThread implements Runnable{

	private Student s;
	private int i = 0;
	
	
	
	public SetThread(Student s) {
		this.s = s;
	}



	@Override
	public void run() {
		while(true) {
			if(i % 2 == 0) {
				s.set("林青霞", 20);
			}else {
				s.set("孙雅", 30);
			}
			i++;
		}
	}
	

}

package cn.day24;

public class GetThread implements Runnable {
	private Student s;

	public GetThread(Student s) {
		this.s = s;
	}
	
	public void run() {
		while(true) {
			s.get();
		}
	}
	
}

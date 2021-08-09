package cn.day24;

import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo {
	public static void main(String[] args) {
		Timer t = new Timer();
		
		t.schedule(new MyTask(t), 3000);
	}
	
}
class MyTask extends TimerTask{
		private Timer t ;
		
		public MyTask() {}
		

		public MyTask(Timer t) {
			this.t = t;
		}
		


		@Override
		public void run() {
			System.out.println("时间到");
			t.cancel();
		}
		
		
		
		
}

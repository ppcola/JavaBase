package cn.day25;

import java.awt.Frame;

public class FrameDemo {
	public static void main(String[] args) {
		Frame f = new Frame("窗体监听");
		
		f.setBounds(200, 100, 500, 300);
		
		f.setVisible(true);
		
		f.addWindowListener();
		
	}
}

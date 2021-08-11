package cn.day26;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo {
	public static void main(String[] args) throws  IOException {
		//Socket s = new Socket(InetAddress.getByName("HP",8888));
		Socket s = new Socket("HP",8888);
		
		OutputStream os = s.getOutputStream();
		os.write("Hello,Tcp".getBytes());
		
		s.close();
		
		//Connection refused (Connection refused)
	}
}

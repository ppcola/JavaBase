package cn.day26;
/**
 * UD发送协议
 * @author xi
 *
 */

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class SenDemo {
	public static void main(String[] args) throws IOException {
		DatagramSocket ds =new DatagramSocket();
		
		byte[] bys = "hello,udp".getBytes();
		
		int lenth = bys.length;
		
		InetAddress address = InetAddress.getByName("192.168.1.102");
		
		int port = 10086;
		
		DatagramPacket dp = new DatagramPacket(bys, lenth,address,port);
		
		
		ds.send(dp); 
		
		ds.close();
	}
}

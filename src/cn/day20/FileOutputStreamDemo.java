package cn.day20;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("file.txt");
		
		fos.write("hello,IO".getBytes());
		
		fos.close();
	}
}

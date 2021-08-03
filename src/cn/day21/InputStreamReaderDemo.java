package cn.day21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(new FileInputStream("file.txt"),"GBK");
		
		int ch = 0;
		while((ch=isr.read())!= -1) {
			System.out.println((char)ch);
		}
		
		isr.close();
		
	}
}

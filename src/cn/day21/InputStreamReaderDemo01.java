package cn.day21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo01 {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr= new InputStreamReader(new FileInputStream("osw.txt"));
		
		char[] chs = new char[1024];
		
		int len = 0;
		while((len = isr.read(chs)) != -1) {
			System.out.println(new String(chs,0,len));
		}
		
		isr.close();
	}
}

package cn.day21;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {
	public static void main(String[] args) throws IOException {
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("osw.txt"));
		
//		osw.write('a');
//		osw.write(97);
		//osw.close();
		
		osw.write("i love China!");
		//刷新缓冲区
		osw.flush();
		
		//释放资源
		osw.close();
		
	}
}

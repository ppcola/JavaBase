package cn.day19;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		File file = new File("/home/xi/Desktop/demo");
		System.out.println("mkdir:"+file.mkdir());
		
		File file2 = new File("/home/xi/Desktop/demo/a.txt");
		System.out.println("CreateNewFile:"+file2.createNewFile());
	}
}

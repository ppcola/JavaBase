package cn.day19;

import java.io.File;
import java.io.IOException;

public class FileDemo01 {
	public static void main(String[] args) throws IOException {
		File file = new File("shuangxi.jpg");
		//System.out.println(file.createNewFile());
		
		File newFile = new File("qinxia.jpg");
		System.out.println(file.renameTo(newFile));
		
	}
}

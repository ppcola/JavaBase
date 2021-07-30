package cn.day19;

import java.io.File;

public class FileDemo02 {
public static void main(String[] args) {
	
	File file = new File("qinxia.jpg");
	System.out.println(file.lastModified());
}
}

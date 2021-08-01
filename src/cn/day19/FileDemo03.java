package cn.day19;

import java.io.File;

public class FileDemo03 {
	public static void main(String[] args) {
		File file = new File("/home/xi/Desktop");
		
//		String[] strArray = file.list();
//		for(String s : strArray) {
//			System.out.println(s);
//		}
		
		File[] fileArray = file.listFiles();
		
		for(File f : fileArray) {
			if(f.isFile()) {
				if(f.getName().endsWith(".txt")) {
					System.out.println(f.getName());
				}
			}
		}
	}
}

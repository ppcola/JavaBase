package cn.day20;

import java.io.File;

public class FilePathDemo {
	public static void main(String[] args) {
		File srcFolder = new File("/home/xi/Documents/JavaBase");
		
		getAllJavaFilePaths(srcFolder);
	}

	private static void getAllJavaFilePaths(File srcFolder) {
		File[] fileArray = srcFolder.listFiles();
		
		for(File file : fileArray) {
			if(file.isDirectory()) {
				getAllJavaFilePaths(file);
			}else {
				if(file.getName().endsWith(".java")) {
					System.out.println(file.getAbsolutePath());
				}
			}
		}
		
	}
	
}

package cn.day21;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArrayListToFileDemo {
	public static void main(String[] args) throws IOException {
		ArrayList<String> array = new ArrayList<String>();
		array.add("hello");
		array.add("world");
		array.add("java");
		
		 BufferedWriter bw = new BufferedWriter(new FileWriter("array.txt"));
		 
		 for(String s : array) {
			 bw.write(s);
			 bw.newLine();
			 bw.flush();
		 }
		 bw.close();
	}
}

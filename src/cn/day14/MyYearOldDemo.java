package cn.day14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MyYearOldDemo {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		 System.out.println("请输入你的出生年月：");
		 String line = sc.nextLine();
		 
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		 Date d = sdf.parse(line);
		 
		 long myTime = d.getTime();
		 
		 long nowTime = System.currentTimeMillis();
		 
		 long time = nowTime - myTime;
		 
		 long day = time /1000 / 60 / 60 / 24;
		 System.out.println(day);
	}
}

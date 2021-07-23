package cn.day14;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
public static void main(String[] args) {
	Date d = new Date();
	
	long time = d.getTime();
	System.out.println(time);
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
	String s = sdf.format(d);
	System.out.println(s);
}
}

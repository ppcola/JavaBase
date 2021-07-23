package cn.day14;

import java.util.Date;

public class DateUtilDemo {
public static void main(String[] args) {
	Date d = new Date();
	
	String s = DateUtil.dateToString(d,"yyyy-MM-dd");
	System.out.println(s);
}
}

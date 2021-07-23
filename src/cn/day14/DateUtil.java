package cn.day14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 这是日期和字符串相互转换的工具类
 * 
 * @author xi
 *
 */

public class DateUtil {
	private DateUtil() {
		
	}
	/**
	 * 这个方法的作用就是把日期转成一个字符串
	 * @param d
	 * 				被转换的对象
	 * @param format
	 * 				传递过来要被转换的格式
	 * @return	格式化后的字符串
	 */
	public static String dateToString(Date d,String format) {
		return new SimpleDateFormat(format).format(d);
	}
	/**
	 * 这个方法的作用就是把一个字符串解析成一个日期对象
	 * @param s
	 * @param format
	 * @return
	 * @throws ParseException
	 */
	public static Date stringTodate(String s,String format) throws ParseException {
		return new SimpleDateFormat(format).parse(s);
	}
}

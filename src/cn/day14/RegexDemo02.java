package cn.day14;

public class RegexDemo02 {
	public static void main(String[] args) {
		String s = "Helloqq12345world62211337728843java";
		
		String regex = "\\d";
		String ss = "*";
		
		String result = s.replaceAll(regex, ss);
		System.out.println(result);
	}
}

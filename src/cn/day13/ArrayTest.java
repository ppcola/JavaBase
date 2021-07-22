package cn.day13;

public class ArrayTest {
	public static void main(String[] args) {
		String s = "dacgebf";
		//转化为字符数组
		char[] chs = s.toCharArray();
		bubbleSort(chs);
		//把字符数组转化成字符串
		String result = String.valueOf(chs);
		System.out.println(result);
	}

	 static void bubbleSort(char[] chs) {
		for(int i = 0; i <chs.length - 1;i++) {
			for(int j = 0; j < chs.length-1-i;j++) {
				if(chs[j]>chs[j+1]) {
					char tmp = chs[j];
					chs[j]=chs[j+1];
					chs[j+1] = tmp;
				}
			}
		}
	}
}

import java.io.*;
import java.util.Random;
import java.util.Scanner;
public class readLine{
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		int j,t=0;
		char y = 'y';
		System.out.println("????????????????");
		j=sc.nextInt();
		System.out.println("??"+j+"¦Ë?????????");

		while(t<j){
			Random r = new Random();
			int rand = r.nextInt(49)+1;
			FileInputStream fos = new FileInputStream("a.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(fos));
			System.out.println(rand);
			int i = 0;
			String temp=null;
			while ((temp=br.readLine())!=null) {
			i++;
			if (i == rand) {
				System.out.println(temp);
				System.out.println("????");
						}
			}
			t=t+1;
	}
  } 
}
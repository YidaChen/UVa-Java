/*
 * 判斷9的倍數
 * 使用每位數總和遞迴相加,直到剩1位,是否為9
 * 並計算遞迴深度
 * */
import java.util.Scanner;

public class UVa10922_2the9s {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()) 
		{
			String str = sc.next();
			if(str.equals("0")) break;
			System.out.print(str);
			
			int degree = 0;
			do {
				int sum = 0;
				for(int i = 0; i < str.length(); ++i)
					sum += Character.getNumericValue(str.charAt(i));
				
				str = Integer.toString(sum);
				degree++;
			} while(str.length() > 1);
			
			if(str.equals("9"))
				System.out.printf(" is a multiple of 9 and has 9-degree %d.\n", degree);
			else
				System.out.printf(" is not a multiple of 9.\n");
		}
	}
}
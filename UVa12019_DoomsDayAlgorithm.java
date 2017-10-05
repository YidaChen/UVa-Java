/*
 * 輸入2011年的日期,找出是星期幾
 * 解:計算日期為一年中的第幾天,除7取餘數
 * */
import java.util.Scanner;

class UVa12019_DoomsDayAlgorithm {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		
		String[] week = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		int[] monthDays = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		while(cases-- > 0) 
		{
			int M = sc.nextInt() - 1;
			int D = sc.nextInt();
			
			for(int i = 0; i < M; ++i)
				D += monthDays[i];
			
			System.out.println(week[(D+5) % 7]); // D+5因為2011/1/1 星期六
		}
	}
}
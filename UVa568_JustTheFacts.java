/*
 * 求出 N!從右邊算來最後一個不是0的數字.(0<=N<=10000)
 * dp, 儲存結尾非零的五位數, 再循序計算下一個數字
 * */
import java.util.Scanner;

public class UVa568_JustTheFacts {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] dp = new int[10001];
		dp[0] = 1;
		for(int i = 1; i <= 10000; ++i) 
		{
			dp[i] = i * dp[i-1];
			while(dp[i] % 10 == 0)
				dp[i] /= 10;
			dp[i] %= 100000;
		}
		while(sc.hasNext()) 
		{
			int n = sc.nextInt();
			System.out.printf("%5d -> %d\n", n, dp[n] % 10);
		}
	}
}
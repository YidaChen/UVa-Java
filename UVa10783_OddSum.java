/*
 * 計算[a,b]區間的奇數和
 * 1+3+5+...+n = ((1+n)/2)^2
 * 修改a為區間最小奇數,修改b為區間最大奇數
 * 求1加到b的奇數和 - 1加到a-2的奇數和
 * ((1+b)/2)^2 - ((1+a-2)/2)^2
 * */
import java.util.Scanner;

public class UVa10783_OddSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cases = sc.nextInt();
		
		for(int i = 1; i <= cases; ++i) 
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a % 2 == 0) ++a;
			if(b % 2 == 0) --b;
			
			int oddSum = (int)(Math.pow((1+b)/2, 2) - Math.pow((1+a-2)/2, 2));
			
			System.out.printf("Case %d: %d\n", i, oddSum);
		}
	}
}
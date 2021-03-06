/*
 * 最大公因數
 * */
import java.util.Scanner;

public class UVa10193_AllYouNeedIsLove {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		for(int i = 1; i <= N; ++i) 
		{
			String s1 = sc.next();
			String s2 = sc.next();
			
			int i1 = Integer.parseInt(s1, 2);
			int i2 = Integer.parseInt(s2, 2);
			
			if(GCD(i1, i2) != 1)
				System.out.printf("Pair #%d: All you need is love!\n", i);
			else
				System.out.printf("Pair #%d: Love is not all you need!\n", i);
		}
	}
	static int GCD(int a, int b) 
	{
		if(b == 0) return a;
		if(a % b == 0) return b;
		return GCD(b, a % b);
	}
}
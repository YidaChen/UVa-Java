/*
 * 遞迴相加位數,直到小於10
 * */
import java.util.Scanner;

class UVa11332_SummingDigits {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		while(true) 
		{
			int n = sc.nextInt();
			if(n == 0) break;
			
			System.out.println(summingDigits(n));
		}
	}
	static int summingDigits(int n) 
	{
		if(n < 10) return n;
		
		int sum = 0;
		
		while(n > 0) 
		{
			sum += n % 10;
			n /= 10;
		}
		return summingDigits(sum);
	}
}
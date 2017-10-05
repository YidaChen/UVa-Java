/*
有點看不懂題目
*/
import java.util.Scanner;

class UVa10101_BanglaNumbers {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int count = 1;
		while(sc.hasNext()) 
		{
			System.out.printf("%4d.", count++);
			
			long n = sc.nextLong();
			if(n == 0) 
			{
				System.out.println(" 0");
				continue;
			}
			bangla(n);
			System.out.println();
		}
	}
	//’kuti’ (10000000), ’lakh’ (100000), ’hajar’ (1000), ’shata’ (100)
	static void bangla(long n) 
	{
		if(n >= 10000000) 
		{
			bangla(n / 10000000);
			System.out.print(" kuti");
			n = n % 10000000;
		}
		if(n >= 100000) 
		{
			bangla(n / 100000);
			System.out.print(" lakh");
			n = n % 100000;
		}
		if(n >= 1000) 
		{
			bangla(n / 1000);
			System.out.print(" hajar");
			n = n % 1000;
		}
		if(n >= 100) 
		{
			bangla(n / 100);
			System.out.print(" shata");
			n = n % 100;
		}
		if(n > 0)
			System.out.print(" " + n);
	}
}
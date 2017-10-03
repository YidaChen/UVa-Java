/*
求在兩數範圍內之值,3n+1長度(cycle-length)的最大值
*/
import java.util.Scanner;

class UVa100 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) 
		{
			int i = sc.nextInt();
			int j = sc.nextInt();
			System.out.print(i + " " + j);
			
			if(i > j) 
			{
				int temp = i;
				i = j;
				j = temp;
			}
			int max = 1;
			
			for(int idx = i; idx <= j; ++idx) 
			{
				int len = length3nplus1(idx);
				if(len > max)
					max = len;
			}
			System.out.println(" " + max);
		}
	}
	static int length3nplus1(int n) 
	{
		int len = 1;
		
		while(n != 1) 
		{
			if(n % 2 == 1) 
				n = n * 3 + 1;
			else 
				n = n / 2;
			
			++len;
		}
		return len;
	}
}
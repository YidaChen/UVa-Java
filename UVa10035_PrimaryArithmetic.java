/*
相加兩數,計算總進位次數
解:從右到左,累加位數與進位數,超過9則計數加1
*/
import java.util.Scanner;

class UVa10035_PrimaryArithmetic {
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		while(true) 
		{
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			if(n1 == 0 && n2 == 0) break;
			
			int carry = 0;
			int carries = 0;
			
			while(n1 != 0 || n2 != 0) 
			{
				int sum = carry + n1 % 10 + n2 % 10;
				
				if(sum >= 10) ++carries;
				
				n1 = n1/10;
				n2 = n2/10;
				carry = sum/10;
			}
			
			if(carries == 0)
				System.out.println("No carry operation.");
			else if(carries == 1)
				System.out.println("1 carry operation.");
			else
				System.out.println(carries + " carry operations.");
		}
	}
}

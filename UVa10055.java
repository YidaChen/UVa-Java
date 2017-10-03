/*
給兩數,求差
*/
import java.util.Scanner;

class UVa10055 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) 
		{
			long l1 = sc.nextLong();
			long l2 = sc.nextLong();
			
			System.out.println(Math.abs(l1 - l2));
		}
	}
}
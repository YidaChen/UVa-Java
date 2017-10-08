/*
 * 找出最小的N(2 <= N <= 62)，使得某整數R在N進位時，可被N-1整除。
 * 62進位數字系統的符號為（0..9，A..Z，a..z），61為（0..9，A..Z，a..y）
 * 解:若 N - 1 可以將某數 每個位數的總和 整除，則此數在 N 進位時可被 N - 1 整除
 * http://naivered.github.io/2016/01/25/Problem_Solving/UVa/UVa-10093-An-Easy-Problem/
 * */
import java.util.Scanner;

public class UVa10093_AnEasyProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()) 
		{
			String str = sc.nextLine();
			int sum = 0, max = 1, i;
			
			for(i = 0; i < str.length(); ++i) 
			{
				int digit = 0;
				
				if(str.charAt(i) >= 97 && str.charAt(i) <= 122) //a-z
					digit = str.charAt(i) - 'a' + 36;
				else if(str.charAt(i) >= 65 && str.charAt(i) <= 90) //A-Z
					digit = str.charAt(i) - 'A' + 10;
				else if(str.charAt(i) >= 48 && str.charAt(i) <= 57) //0-9
					digit = Character.getNumericValue(str.charAt(i));
				
				sum += digit;
				if(digit > max)
					max = digit;
			}
			for(i = max; i < 62; ++i) 
			{
				if(sum % i == 0) 
				{
					System.out.println(i+1);
					break;
				}
			}
			if(i == 62)
				System.out.println("such number is impossible!");
		}
	}
}
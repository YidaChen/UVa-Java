/*
判斷11的倍數
解:奇數位和-偶數位和為11的倍數
*/
import java.util.Scanner;

class UVa10929 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		while(true) 
		{
			String str = sc.next();
			if(str.equals("0")) break;
			
			char[] charArr = str.toCharArray();
			int oddSum = 0, evenSum = 0;
			
			for(int i = 0; i < charArr.length; ++i) 
			{
				if(i % 2 == 0)
					evenSum += Character.getNumericValue(charArr[i]);
				else
					oddSum += Character.getNumericValue(charArr[i]);
			}
			if((oddSum - evenSum) % 11 == 0)
				System.out.println(str + " is a multiple of 11.");
			else
				System.out.println(str + " is not a multiple of 11.");
		}
	}
}
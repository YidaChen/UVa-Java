/*
 * 信用卡卡號驗證 Luhn algorithm
 * */
import java.util.Scanner;

public class UVa11743_CreditCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		while(N-- > 0) 
		{
			String[] str = new String[4];
			for(int i = 0; i < 4; ++i) str[i] = sc.next();
			int sum = 0;
			for(int i = 0; i < 4; ++i)
				for(int j = 0; j < 4; ++j) 
				{
					if(i % 2 == 0) 
						for(int n = (str[j].charAt(i) - 48) * 2; n != 0; n /= 10) 
							sum += n % 10;
					else
						sum += str[j].charAt(i) - 48;
				}
			if(sum % 10 == 0)
				System.out.println("Valid");
			else
				System.out.println("Invalid");
		}
	}
}
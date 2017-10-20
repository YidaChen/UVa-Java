/*
 * 判斷2行文字是否完全相同(Yes),移除空白相同(Output Format Error),不相同(Wrong Answer)
 * */
import java.util.Scanner;

public class UVa11734_BigNumberOfTeamsWillSolveThis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		for(int c = 1; c <= t; ++c) 
		{
			String str1 = sc.nextLine();
			String str2 = sc.nextLine();
			if(str1.equals(str2)) 
			{
				System.out.printf("Case %d: Yes\n", c);
				continue;
			}
			boolean FormatError = true;
			int i = 0, j = 0;
			for(; i < str1.length() && j < str2.length();) 
			{
				if(str1.charAt(i) == ' ') 
				{
					++i;
					continue;
				}
				if(str2.charAt(j) == ' ') 
				{
					++j;
					continue;
				}
				if(str1.charAt(i) != str2.charAt(j)) 
				{
					FormatError = false;
					break;
				}
				++i;
				++j;
			}
			if(!FormatError) 
			{
				System.out.printf("Case %d: Wrong Answer\n", c);
				continue;
			}
			for(; i < str1.length(); ++i)
				if(str1.charAt(i) != ' ')
					FormatError = false;
			for(; j < str2.length(); ++j)
				if(str2.charAt(j) != ' ')
					FormatError = false;
			if(FormatError)
				System.out.printf("Case %d: Output Format Error\n", c);
			else
				System.out.printf("Case %d: Wrong Answer\n", c);
		}
	}
}
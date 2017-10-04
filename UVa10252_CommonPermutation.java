/*
 * 計算兩個小寫英文字串共同出現的字元,並計算共同次數,出現n次打印n次,以字母排序打印
 * */
import java.util.Scanner;

class UVa10252_CommonPermutation {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) 
		{
			String a = sc.nextLine();
			String b = sc.nextLine();
			
			int[] alphaA = new int[26];
			int[] alphaB = new int[26];
			
			for(int i = 0; i < a.length(); ++i) 
				alphaA[a.charAt(i) - 97]++;
			
			for(int i = 0; i < b.length(); ++i) 
				alphaB[b.charAt(i) - 97]++;
			
			for(int i = 0; i < 26; ++i) 
			{
				int count = Math.min(alphaA[i], alphaB[i]);
				
				for(int j = 0; j < count; ++j)
					System.out.print((char)(i + 97));
			}
			System.out.println();
		}
	}
}
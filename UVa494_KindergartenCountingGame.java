/*
 * 計算每行有幾個字（A-Z,a-z組成）
 * */
import java.util.Scanner;

public class UVa494_KindergartenCountingGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) 
		{
			String str = sc.nextLine();
			int word = 0;
			boolean isWord = false;
			
			for(int i = 0; i < str.length(); ++i) 
			{
				if((str.charAt(i) >= 65 && str.charAt(i) <= 90) || 
				   (str.charAt(i) >= 97 && str.charAt(i) <= 122)) 
				{
					if(isWord) continue;
					word++;
					isWord = true;
				}
				else
					isWord = false;
			}
			
			System.out.println(word);
		}
	}
}
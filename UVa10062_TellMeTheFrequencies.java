/*
 * 給一串字元,找出各字元出現的次數
 * 輸出各字元的ASCII值及其出現的次數,次數從小到大,再由ASCII值大到小
 * */
import java.util.Scanner;

public class UVa10062_TellMeTheFrequencies {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean firstCase = true;

		while(sc.hasNext()) 
		{
			if(!firstCase) System.out.println(); //case間空行
			else firstCase = false;
			
			String str = sc.nextLine();
			int[] asc2 = new int[127];
			for(int i = 0; i < str.length(); ++i) //計算次數
				asc2[str.charAt(i)]++;
			
			int max = 0;
			for(int i = 0; i < asc2.length; ++i) //最大次數
				if(asc2[i] > max)
					max = asc2[i];
			
			for(int i = 1; i <= max; ++i)
				for(int j = asc2.length-1; j >= 0; --j)
					if(i == asc2[j])
						System.out.println(j + " " + i);
		}
	}
}
/*
 * 給一個等比數列的首項和公比的倒數，如果尾項是1輸出這個數列，否則輸出Boring!
 * */
import java.util.Scanner;

public class UVa10190_DivideButNotQuiteConquer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()) 
		{
			int n = sc.nextInt(); //首項
			int m = sc.nextInt(); //公比的倒數(用除的)
			if(m <= 1 || n < m) //題目要求數列遞減,公比倒數需>1
			{
				System.out.println("Boring!");
				continue;
			}
			StringBuilder sb = new StringBuilder();
			
			for(; n % m == 0 && n > m; n /= m)
				sb.append(n + " ");
			
			if(n != m)
				System.out.println("Boring!");
			else
				System.out.println(sb + (m+" ") + 1);
		}
	}
}
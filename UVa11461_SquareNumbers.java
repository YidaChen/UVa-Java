/*
 * 完全平方數是平方根為整數的整數,如1, 4, 81
 * 給兩整數a與b,求a與b之間有幾個完全平方數
 * 解:b的平方根 - a的平方根
 * 若a為完全平方數,解+1
 * */
import java.util.Scanner;

public class UVa11461_SquareNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()) 
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a == 0 && b == 0) break;
			
			int sqrtA = (int)Math.sqrt(a);
			int ans = (int)Math.sqrt(b) - sqrtA;
			if(sqrtA * sqrtA == a)
				ans++;
			
			System.out.println(ans);
		}
	}
}
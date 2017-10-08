/*
 * x, y >= 0
 * x + y = s
 * x - y = d or y - x = d
 * s + d 必為偶數
 * */
import java.util.Scanner;

public class UVa10812_BeatTheSpread {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		
		while(cases-- > 0) 
		{
			int s = sc.nextInt();
			int d = sc.nextInt();
			int x, y;
			
			x = (s + d) / 2;
			y = s - x;
			
			if((s + d) % 2 == 1 || x < 0 || y < 0) 
				System.out.println("impossible");
			else if(x > y)
				System.out.printf("%d %d\n", x, y);
			else
				System.out.printf("%d %d\n", y, x);
		}
	}
}
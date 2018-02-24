import java.util.Scanner;

public class UVa11799_HorrorDash {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) 
		{
			int N = sc.nextInt();
			int max = 1;
			int c;
			while (N-- > 0) {
				c = sc.nextInt();
				if (max < c)
					max = c;
			}
			System.out.printf("Case %d: %d\n", t, max);
		}
	}
}
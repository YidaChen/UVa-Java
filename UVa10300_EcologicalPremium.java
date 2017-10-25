import java.util.Scanner;

public class UVa10300_EcologicalPremium {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-- > 0) 
		{
			int f = sc.nextInt();
			long sum = 0;
			while(f-- > 0) 
			{
				long size = sc.nextInt();
				int animal = sc.nextInt();
				long degree = sc.nextInt();
				sum += size * degree;
			}
			System.out.println(sum);
		}
	}
}
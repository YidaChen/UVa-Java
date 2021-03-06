import java.util.Scanner;

public class UVa11417_GCD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()) 
		{
			int N = sc.nextInt();
			if(N == 0) break;
			
			int G = 0;
			for(int i = 1; i < N; ++i)
				for(int j = i+1; j <= N; ++j)
					G += GCD(i, j);
			
			System.out.println(G);
		}
	}
	static int GCD(int i, int j) 
	{
		if(j == 0) return i;
		if(i % j == 0) return j;
		return GCD(j, i % j);
	}
}
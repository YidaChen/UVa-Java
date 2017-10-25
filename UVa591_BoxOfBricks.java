import java.util.Scanner;

public class UVa591_BoxOfBricks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int t = 1; true; t++) 
		{
			int N = sc.nextInt();
			if(N == 0) break;
			
			int[] h = new int[N];
			int sum = 0;
			for(int i = 0; i < N; ++i)
			{
				h[i] = sc.nextInt();
				sum += h[i];
			}
			int avg = sum / N;
			int move = 0;
			for(int i = 0; i < N; ++i)
				if(h[i] > avg)
					move += h[i] - avg;
			
			System.out.println("Set #" + t);
			System.out.printf("The minimum number of moves is %d.\n\n", move);
		}
	}
}
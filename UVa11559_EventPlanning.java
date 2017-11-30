import java.util.Scanner;

public class UVa11559_EventPlanning {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) 
		{
			int N = sc.nextInt();
			int B = sc.nextInt();
			int H = sc.nextInt();
			int W = sc.nextInt();
			int min = 0;
			while(H-- > 0) 
			{
				int p = sc.nextInt();
				for(int i = 0; i < W; ++i) 
				{
					int w = sc.nextInt();
					if(w < N) continue;
					int price = p * N;
					if(price < B && (price < min || min == 0))
						min = price;
				}
			}
			if(min == 0)
				System.out.println("stay home");
			else
				System.out.println(min);
		}
	}
}
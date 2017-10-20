import java.util.Scanner;

public class UVa12015_GoogleIsFeelingLucky {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for(int t = 1; t <= T; ++t) 
		{
			String[] url = new String[10];
			int[] relevance = new int[10];
			int max = 0;
			
			for(int i = 0; i < 10; ++i) 
			{
				url[i] = sc.next();
				relevance[i] = sc.nextInt();
				if(relevance[i] > max)
					max = relevance[i];
			}
			System.out.printf("Case #%d:\n", t);
			for(int i = 0; i < 10; ++i)
				if(max == relevance[i])
					System.out.println(url[i]);
		}
	}
}
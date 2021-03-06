import java.util.Scanner;

public class UVa10050_Hartals {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		while(T-- > 0) 
		{
			int N = sc.nextInt();
			int P = sc.nextInt();
			int[] parties = new int[P]; //政黨罷會週期
			
			for(int i = 0; i < P; ++i)
				parties[i] = sc.nextInt();
			
			int loss = 0; //罷會天數
			for(int d = 1; d <= N; ++d) //從第一天走到最後一天
			{
				if((d+1) % 7 == 0 || d % 7 == 0) //五六不算
					continue;
				for(int i = 0; i < P; ++i) 
				{
					if(d % parties[i] == 0) //此天在某黨罷會週期
					{
						loss++;
						break;
					}
				}
			}
			System.out.println(loss);
		}
	}
}
import java.util.Arrays;
import java.util.Scanner;

public class UVa11727_CostCutting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t = 1; t <= T; ++t) 
		{
			int[] arr = new int[3];
			for(int i = 0; i < 3; ++i)
				arr[i] = sc.nextInt();
			Arrays.sort(arr);
			System.out.printf("Case %d: %d\n", t, arr[1]);
		}
	}
}
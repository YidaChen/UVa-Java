/*
 * GCD
 * */
import java.util.Arrays;
import java.util.Scanner;

public class UVa11827_MaximumGCD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		while(N-- > 0) 
		{
			String str = sc.nextLine();
			String[] strArr = str.split(" +");
			int[] arr = Arrays.stream(strArr).mapToInt(Integer::parseInt).toArray();
			
			int max = 1;
			for(int i = 0; i < arr.length; ++i)
				for(int j = i+1; j < arr.length; ++j)
					max = Math.max(max, GCD(arr[i], arr[j]));
			System.out.println(max);
		}
	}
	static int GCD(int a, int b) 
	{
		if(b == 0) return a;
		if(a % b == 0) return b;
		return GCD(b, a % b);
	}
}
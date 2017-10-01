/*
給定直線上幾個點,找出直線上某點離每一點有最小的距離和
解:排序點,找出中位數,循環累加距離差
*/
import java.util.Scanner;
import java.util.Arrays;

class UVa10041 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		int totalCase = input.nextInt();
		while (totalCase-- > 0) 
		{
			int r = input.nextInt();
			int[] s = new int[r];

			for (int i = 0; i < s.length; ++i)
				s[i] = input.nextInt();

			Arrays.sort(s);

			int median = s[r / 2];
			int distanceSum = 0;
			for (int i = 0; i < s.length; ++i)
				distanceSum += Math.abs(median - s[i]);

			System.out.println(distanceSum);
		}
	}
}

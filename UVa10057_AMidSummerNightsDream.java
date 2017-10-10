/*
 * 給出n個數，求一個數A，使得所有數和它的差的絕對值的和最小
 * 求出最小的A; n個數中可以滿足A的個數; 可以滿足A的整數個數
 * 解: 中位數
 * */
import java.util.Arrays;
import java.util.Scanner;

public class UVa10057_AMidSummerNightsDream {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()) 
		{
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i = 0; i < n; ++i)
				arr[i] = sc.nextInt();
			
			Arrays.sort(arr);
			int mid1 = arr[(n-1)/2];
			int mid2 = arr[n/2]; //若n為奇數將與mid1相同,只有一個中位數,偶數則有2個
			
			int same = 0;
			for(int i = 0; i < n; ++i) //與中位數相同的個數
				if(arr[i] == mid1 || arr[i] == mid2)
					++same;
			
			int diff = mid2 - mid1 + 1; //中位數區間的整數個數
			
			System.out.printf("%d %d %d\n", mid1, same, diff);
		}
	}
}
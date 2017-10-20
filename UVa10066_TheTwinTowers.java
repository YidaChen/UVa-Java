/*
 * LCS Longest common subsequence
 * 最長公共子序列
 * */
import java.util.Scanner;

public class UVa10066_TheTwinTowers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int t = 1; true; ++t) 
		{
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			if(t != 1) System.out.println();
			if(n1 == 0 && n2 == 0) break;
			
			int[] arr1 = new int[n1+1];
			int[] arr2 = new int[n2+1];
			for(int i = 1; i <= n1; ++i) arr1[i] = sc.nextInt();
			for(int j = 1; j <= n2; ++j) arr2[j] = sc.nextInt();
			
			int[][] lcs = new int[n1+1][n2+1];
			//for(int i = 0; i <= n1; ++i) lcs[i][0] = 0;
			//for(int j = 0; j <= n2; ++j) lcs[0][j] = 0;
			
			for(int i = 1; i <= n1; ++i) 
				for(int j = 1; j <= n2; ++j) 
				{
					if(arr1[i] == arr2[j])
						lcs[i][j] = lcs[i-1][j-1] + 1;
					else
						lcs[i][j] = Math.max(lcs[i-1][j], lcs[i][j-1]);
				}
			System.out.println("Twin Towers #" + t);
			System.out.println("Number of Tiles : " + lcs[n1][n2]);
		}
	}
}
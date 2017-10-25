/*
 * 有3個桶子各裝了一些玻璃瓶,玻璃瓶有3種顏色
 * 移動玻璃瓶,使每個桶子各裝1種顏色的玻璃瓶的最小移動次數
 * 求每個桶子裝的玻璃瓶顏色與移動次數
 * */
import java.util.Scanner;

public class UVa102_EcologicalBinPacking {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) 
		{
			int[] B = new int[3];
			int[] G = new int[3];
			int[] C = new int[3];
			int sum = 0; //玻璃瓶總數
			
			for(int i = 0; i < 3; ++i) 
			{
				B[i] = sc.nextInt();
				G[i] = sc.nextInt();
				C[i] = sc.nextInt();
				sum += B[i] + G[i] + C[i];
			}
			String[] ans = {"BCG","BGC","CBG","CGB","GBC","GCB"}; //顏色的排列組合
			int[] move = new int[6]; //不同顏色組合的移動次數
			move[0] = sum - B[0] - G[2] - C[1]; //減掉不用移動的玻璃瓶
			move[1] = sum - B[0] - G[1] - C[2];
			move[2] = sum - B[1] - G[2] - C[0];
			move[3] = sum - B[2] - G[1] - C[0];
			move[4] = sum - B[1] - G[0] - C[2];
			move[5] = sum - B[2] - G[0] - C[1];
			
			int minIdx = 0;
			for(int i = 1; i < 6; ++i)
				if(move[i] < move[minIdx])
					minIdx = i;
			
			System.out.println(ans[minIdx] + " " + move[minIdx]);
		}
	}
}
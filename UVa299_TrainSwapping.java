/*
 * 計算冒泡排序交換次數
 * */
import java.util.Scanner;

public class UVa299_TrainSwapping {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		while(N-- > 0) 
		{
			int L = sc.nextInt();
			int[] arr = new int[L];
			for(int i = 0; i < L; ++i)
				arr[i] = sc.nextInt();
			
			int swap = 0;
			for(int i = 0; i < L-1; ++i) 
			{
				boolean swapped = false;
				for(int j = 0; j < L-i-1; ++j) 
					if(arr[j] > arr[j+1]) 
					{
						int temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
						swap++;
						swapped = true;
					}
				if(!swapped) break;
			}
			System.out.printf("Optimal train swapping takes %d swaps.\n", swap);
		}
	}
}
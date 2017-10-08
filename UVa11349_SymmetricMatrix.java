/*
 * 判斷是否為對稱方陣 (元素>=0且對稱於方陣中心)
 * 解: 存入一維陣列,比較頭尾是否相等,繼續往內移動比較
 * */
import java.util.Scanner;

public class UVa11349_SymmetricMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		
		for(int i = 1; i <= cases; ++i) 
		{
			sc.next(); sc.next();
			int N = sc.nextInt();
			int size = N * N;
			long[] M = new long[size];
			
			for(int j = 0; j < size; ++j) 
				M[j] = sc.nextLong();
			
			int halfSize = size / 2;
			boolean isSymmetric = true;
			
			for(int j = 0; j <= halfSize; ++j) 
			{
				if(M[j] < 0 || M[j] != M[size - j - 1]) 
				{
					isSymmetric = false;
					break;
				}
			}
			if(isSymmetric)
				System.out.printf("Test #%d: Symmetric.\n", i);
			else
				System.out.printf("Test #%d: Non-symmetric.\n", i);
		}
	}
}
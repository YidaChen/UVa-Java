/*
 * B2數列指一正整數列1 <= b1 < b2 < b3 ...，所有 bi + bj （i <= j）皆不相等
 * 判斷是否為B2數列
 * 解:輸入時判斷由小到大
 * 建所有相加可能值的表,雙迴圈填入表
 * */
import java.util.Scanner;

public class UVa11063_B2Sequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 1;
		
		while(sc.hasNext()) 
		{
			int N = sc.nextInt();
			int[] arr = new int[N];
			boolean isB2 = true;
			
			arr[0] = sc.nextInt();
			if(arr[0] < 1) isB2 = false;
			
			for(int i = 1; i < N; ++i) 
			{
				arr[i] = sc.nextInt();
				
				if(arr[i] <= arr[i-1])
					isB2 = false;
			}
			if(!isB2) 
			{
				System.out.printf("Case #%d: It is not a B2-Sequence.\n\n", count++);
				continue;
			}
			boolean[] val = new boolean[20001];
			for(int i = 0; i < N; ++i) 
			{
				for(int j = i; j < N; ++j)
				{
					int sum = arr[i] + arr[j];
					if(val[sum])
						isB2 = false;
					else
						val[sum] = true;
				}
			}
			if(isB2)
				System.out.printf("Case #%d: It is a B2-Sequence.\n\n", count++);
			else
				System.out.printf("Case #%d: It is not a B2-Sequence.\n\n", count++);
		}
	}
}
import java.util.Scanner;

public class UVa10855_RotatedSquare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) 
		{
			int N = sc.nextInt();
			int n = sc.nextInt();
			if(N == 0 && n == 0) break;
			char[][] ARR = new char[N][N];
			char[][] arr = new char[n][n];
			for(int i = 0; i < N; ++i)
				ARR[i] = sc.next().toCharArray();
			for(int i = 0; i < n; ++i)
				arr[i] = sc.next().toCharArray();
			
			System.out.print(sameCount(ARR, arr, N, n));
			for(int i = 0; i < 3; ++i)
			{
				arr = rotateSquare(arr, n);
				System.out.print(" " + sameCount(ARR, arr, N, n));
			}
			System.out.println();
		}
	}
	static char[][] rotateSquare(char[][] arr, int n)//順時針轉90度
	{
		char[][] newArr = new char[n][n];
		for(int i = 0; i < n; ++i)
			for(int j = 0; j < n; ++j)
				newArr[j][n-i-1] = arr[i][j];
		return newArr;
	}
	static int sameCount(char[][] ARR, char[][] arr, int N, int n)//小方陣在大方陣中出現個數
	{
		int count = 0;
		int diff = N - n;
		for(int i = 0; i <= diff; ++i)
			for(int j = 0; j <= diff; ++j) 
			{
				boolean isSame = true;
				for(int x = 0; x < n; ++x)
					for(int y = 0; y < n; ++y)
						if(ARR[i+x][j+y] != arr[x][y])
							isSame = false;
				if(isSame)
					count++;
			}
		return count;
	}
}
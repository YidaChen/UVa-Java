/*
 * 輸入踩地雷的二維陣列,將非地雷格填入四周地雷數,輸出
 * */
import java.util.Scanner;

public class UVa10189_Minesweeper {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int test = 1;
		while(true) 
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n == 0) break;
			sc.nextLine();
			
			char[][] arr = new char[n][m];
			
			for(int i = 0; i < n; ++i)
				arr[i] = sc.nextLine().toCharArray();
			
			for(int i = 0; i < n; ++i)
				for(int j = 0; j < m; ++j) 
				{
					if(arr[i][j] == '*') continue;
					
					int mine = 0; //計算四周地雷數
					for(int k = i-1; k <= i+1; ++k) //左右兩column
					{
						if(k>=0 && k<n && j-1>=0 && arr[k][j-1] == '*')
							mine++;
						if(k>=0 && k<n && j+1<m && arr[k][j+1] == '*')
							mine++;
					}
					if(i-1>=0 && arr[i-1][j] == '*') //上下兩格
						mine++;
					if(i+1<n && arr[i+1][j] == '*')
						mine++;
					
					arr[i][j] = Integer.toString(mine).charAt(0);//int轉String再轉char
				}
			if(test != 1) System.out.println();
			System.out.printf("Field #%d:\n", test++);
			for(int i = 0; i < n; ++i)
				System.out.println(arr[i]);
		}
	}
}
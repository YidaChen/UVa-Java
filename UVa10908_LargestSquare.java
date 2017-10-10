/*
 * 給一個由字元構成的矩形及座標 (r,c);左上角座標(0,0),右下角(M−1,N−1)
 * 求出由相同字元所構成的最大正方形的邊長,(r,c)為此最大正方形的中心
 * 解: 從中心往四周擴散,比對字元
 * */
import java.util.Scanner;

public class UVa10908_LargestSquare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();	
		while(T-- > 0) 
		{
			int M = sc.nextInt();
			int N = sc.nextInt();
			int Q = sc.nextInt();
			char[][] grid = new char[M][N]; //矩形
			
			for(int i = 0; i < M; ++i)
				grid[i] = sc.next().toCharArray();
			
			System.out.printf("%d %d %d\n", M, N, Q);
			while(Q-- > 0) 
			{
				int r = sc.nextInt();
				int c = sc.nextInt();
				char cen = grid[r][c]; //正方形中心字元
				int len = 1; //從與中心相隔1開始往四周擴散,比對字元
				boolean isSame = true;
				
				while(r-len>=0 && c-len>=0 && r+len<M && c+len<N) //在矩形邊界內
				{
					for(int i = r-len; i <= r+len; ++i) //走左右2條column
					{
						if(grid[i][c-len] != cen || grid[i][c+len] != cen) 
						{
							isSame = false;
							break;
						}
					}
					if(!isSame) break;
					for(int j = c-len+1; j <= c+len-1; ++j) //走上下2條row,四角已走過,故+1-1
					{
						if(grid[r-len][j] != cen || grid[r+len][j] != cen) 
						{
							isSame = false;
							break;
						}
					}
					if(!isSame) break;
					len++; //繼續往外圈擴散
				}
				System.out.println(len * 2 - 1); //有中心點的方形,邊長必為奇數
			}
		}
	}
}
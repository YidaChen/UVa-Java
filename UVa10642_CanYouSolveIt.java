/* http://ikatyang.blogspot.tw/2014/08/uva-10642-can-you-solve-it.html
 * 觀察圖, c1,c2兩點步數 = 原點到c2 - 原點到c1
 * (0,0)→
 * (0,1)→(1,0)→
 * (0,2)→(1,1)→(2,0)→
 * (0,3)→(1,2)→(2,1)→(3,0)→
 * 每組的座標和 S = ( x + y )相同，且個數為 S + 1
 * 假設C點為(1,1)，則Cx+Cy=SC=2，而從原點(0,0) 至C點所需步數為((1+2)+1)=4
 * 假設C點為(2,2)，則Cx+Cy=SC=4，而從原點(0,0) 至C點所需步數為 ( ( 1 + 2 + 3 + 4 ) + 2 ) = 12
 * 可得從原點至C點所需步數: PC=(1+2+...+SC)+Cx
 * */
import java.util.Scanner;

public class UVa10642_CanYouSolveIt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i = 1; i <= n; ++i) 
		{
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			
			int dis = originToPoint(x2, y2) - originToPoint(x1, y1);
			System.out.printf("Case %d: %d\n", i, dis);
		}
	}
	static int originToPoint(int x, int y) 
	{
		int s = x + y;
		return (1+s) * s / 2 + x; 
	}
}
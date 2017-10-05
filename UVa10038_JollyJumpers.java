/*
 * 給n個整數,共有n-1個相鄰兩數的差,若差可填滿1~n-1,為Jolly Jumpers
 * 只有一個整數也為Jolly Jumpers
 * 一迴圈解:建一個大小為n-1的bool差表,在輸入整數的同時,計算差,填進bool差表
 * 若差不在1~n-1範圍內或bool差表已被占用,則Not jolly
 * */
import java.util.Scanner;

class UVa10038_JollyJumpers {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) 
		{
			int n = sc.nextInt();
			boolean[] diffTable = new boolean[n-1];
			boolean isJollyJumpers = true;
			
			int prev = sc.nextInt();
			
			for(int i = 1; i < n; ++i) 
			{
				int next = sc.nextInt();
				if(!isJollyJumpers) continue;
				
				int diff = Math.abs(next - prev);
				prev = next;
				
				if(diff > n - 1 || diff == 0 || diffTable[diff - 1]) 
					isJollyJumpers = false;
				else
					diffTable[diff - 1] = true; //此差已被占用
			}
			if(isJollyJumpers)
				System.out.println("Jolly");
			else
				System.out.println("Not jolly");
		}
	}
}
/* http://luckycat.kshs.kh.edu.tw/homework/q11005.htm
 * 當把數字表示成n進位（2 <= n <= 36）
 * 需要用到字串'0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ'的前n項
 * 每個字元都有他獨特的花費，對於每一個數字，他被印出的價錢是組成他的字元被印出的價錢和
 * 給你一個數字，請計算他用哪些進位輸出最省錢
 * */
import java.util.Scanner;

public class UVa11005_CheapestBase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cases = sc.nextInt();
		for(int i = 1; i <= cases; ++i)
		{
			if(i != 1)
				System.out.println();
			System.out.printf("Case %d:\n", i);
			
			int[] charCost = new int[36]; //存每個字元的花費
			for(int j = 0; j < 36; ++j)
				charCost[j] = sc.nextInt();
			
			int queries = sc.nextInt();
			while(queries-- > 0) 
			{
				int num = sc.nextInt();
				System.out.printf("Cheapest base(s) for number %d:", num);
				
				int[] baseCost = new int[37]; //使用某進位的總花費
				for(int base = 2; base <= 36; ++base) 
					for(int n = num; n > 0; n /= base) //十進位轉<base>進位的算法
						baseCost[base] += charCost[n % base];
				
				int minCost = baseCost[2];
				for(int k = 3; k <= 36; ++k) //找出最小花費
					if(baseCost[k] < minCost)
						minCost = baseCost[k];
				
				for(int x = 2; x <= 36; ++x) //找出最小花費的進位
					if(baseCost[x] == minCost)
						System.out.print(" " + x);
				
				System.out.println();
			}
		}
	}
}
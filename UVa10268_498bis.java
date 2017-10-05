/*
 * 計算多項式微分(導函數)的值
 * a0xn+a1xn-1+...+an-1x+an => a0nxn-1+a1(n-1)xn-2+...+an-1
 * 解:從右到左累加,累乘x,防止重複計算
 * */
import java.util.Scanner;

class UVa10268_498bis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) 
		{
			int x = Integer.parseInt(sc.nextLine());
			String[] coefficients = sc.nextLine().split("\\s+"); //跳過多個空白
			
			System.out.println(derivative(x, coefficients));
		}
	}
	static int derivative(int x, String[] coefficients) 
	{
		int ans = 0, pow = 1;
		
		for(int i = coefficients.length - 2; i >= 0; --i, pow *= x)
			ans += Integer.parseInt(coefficients[i]) * (coefficients.length-1-i) * pow;
		
		return ans;
	}
}
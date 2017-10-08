/*
 * 輸入十進位的數字，以費氏進位輸出
 * */
import java.util.ArrayList;
import java.util.Scanner;

public class UVa948_FibonaccimalBase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		ArrayList<Integer> Fib = Fibonacci(100000000); //初始化費氏數列
		
		while(cases-- > 0) 
		{
			int n = sc.nextInt();
			System.out.printf("%d = ", n);
			int i;
			
			for(i = 2; i < Fib.size(); ++i) //找到>=n的數的索引
				if(n <= Fib.get(i))
					break;
			
			if(n < Fib.get(i)) --i; //找到>n的前一個數(會<n)的索引
			
			StringBuilder sb = new StringBuilder();
			for(; i > 1; --i) //只到Fib[2]
			{
				if(n >= Fib.get(i)) //沒超過n,代表可以減去
				{
					n -= Fib.get(i);
					sb.append("1");
				}
				else 
					sb.append("0");
			}
			System.out.println(sb + " (fib)");
		}
	}
	static ArrayList<Integer> Fibonacci(int max)
	{
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(0);
		arr.add(1);
		
		while(arr.get(arr.size()-1) <= max) //max:最大算到的值
			arr.add(arr.get(arr.size()-1) + arr.get(arr.size()-2));
		
		return arr;
	}
}
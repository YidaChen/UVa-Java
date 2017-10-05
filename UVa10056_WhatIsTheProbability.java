/*
 * N個人輪流擲贏的機率為p骰子,第I個人贏的機率為? (設q = 1 - p)
 * I第一輪贏的機率為: q^(I-1) * p
 * I第二輪贏的機率為: q^(I-1) * p * q^N
 * I第三輪贏的機率為: q^(I-1) * p * q^2N
 * I贏的機率為: q^(I-1) * p * (1 + q^N + q^2N +...+ q^xN), x趨近無窮大
 * 無窮等比級數公式: 首項 / (1 - 公比)
 * 故I贏的機率為: q^(I-1) * p / (1 - q^N)
 * */
import java.math.BigDecimal;
import java.util.Scanner;

public class UVa10056_WhatIsTheProbability {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		
		while(cases-- > 0) 
		{
			int N = sc.nextInt(); //總人數
			double p = sc.nextDouble(); //骰出贏的機率
			double q = 1 - p; //沒骰出贏的機率
			int I = sc.nextInt(); //第幾人
			
			if(p == 0.0) 
			{
				System.out.println("0.0000");
				continue;
			}
			double win = Math.pow(q, I-1) * p / (1 - Math.pow(q, N));
			System.out.println(new BigDecimal(win).setScale(4, BigDecimal.ROUND_HALF_UP));
		}
	}
}
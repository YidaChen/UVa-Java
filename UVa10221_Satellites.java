/*
 * 給定半徑,夾角, 算出弧長與弦長
 * 弧長: 2 * PI * r * 夾角度/360
 * 弦長:餘弦定理 https://zh.wikipedia.org/wiki/%E9%A4%98%E5%BC%A6%E5%AE%9A%E7%90%86
 * c^2 = a^2 + b^2 - 2ab*cos(弧度)
 * */
import java.util.Scanner;

public class UVa10221_Satellites {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int radius = 6440;

		while(sc.hasNext()) 
		{
			int s = sc.nextInt();
			int r = radius + s;
			double a = sc.nextInt();
			String unit = sc.next();
			
			if(unit.equals("deg"))
				a=Math.min(360-a, a);
			else
				a /= 60;
			
			double arc = 2 * Math.PI * r * a/360;
			//2*r*r-2*r*r*Math.cos(a*Math.PI/180) = 2*r*r*(1-Math.cos(a*Math.PI/180))
			double chord = Math.sqrt(2*r*r*(1-Math.cos(a*Math.PI/180)));
			
			System.out.printf("%.6f %.6f\n", arc, chord);
		}
	}
}
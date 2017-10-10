/*
 * 骰子1點在上方,往東南西北滾動數次後,骰子上方為幾點?
 * 解:骰子的正對面和為7
 * 每次滾動一面,計算上方與南北或東西
 * 往南北不改變東西,往東西不改變南北
 * */
import java.util.Scanner;

public class UVa10409_DieGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true) 
		{
			int n = sc.nextInt();
			if(n == 0) break;
			
			int top = 1;
			int north = 2;
			int south = 5;
			int east = 4;
			int west = 3;
			
			while(n-- > 0) 
			{
				String direction = sc.next();
				
				if(direction.equals("north")) 
				{
					north = top;
					top = south;
					south = 7 - north;
				}
				else if(direction.equals("south")) 
				{
					south = top;
					top = north;
					north = 7 - south;
				}
				else if(direction.equals("east")) 
				{
					east = top;
					top = west;
					west = 7 - east;
				}
				else if(direction.equals("west")) 
				{
					west = top;
					top = east;
					east = 7 - west;
				}
			}
			System.out.println(top);
		}
	}
}
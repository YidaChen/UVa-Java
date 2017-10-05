/*
 * 有一旅館每次住進一個旅行團,旅行團離開隔天,另一旅行團馬上住進
 * 若第一個旅行團有S人,則住S天,下一個旅行團人數為S+1人,住S+1天
 * 給定第一個旅行團人數S,問第D天住在旅館的旅行團人數為?
 * */
import java.util.Scanner;

public class UVa10170_TheHotelWithInfiniteRooms {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) 
		{
			int S = sc.nextInt(); //當前旅行團人數
			long D = sc.nextLong(); //第D天
			long sum = S; //當前旅行團住到第sum天
			
			while(sum < D)
				sum += ++S;
			
			System.out.println(S);
		}
	}
}
/*
 * 輸入一首曲子,每個音調由不同指法組成,計算每一根手指頭按了多少次按鍵
 * 如果某一按鍵在下一音符時不會用到，就會放開，否則就是維持按著的情況
 * */
import java.util.HashMap;
import java.util.Scanner;

public class UVa10415_EbAltoSaxophonePlayer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//音調對應的指法
		HashMap<Character, String> map = new HashMap<Character, String>();
		map.put('c', "0111001111");
		map.put('d', "0111001110");
		map.put('e', "0111001100");
		map.put('f', "0111001000");
		map.put('g', "0111000000");
		map.put('a', "0110000000");
		map.put('b', "0100000000");
		map.put('C', "0010000000");
		map.put('D', "1111001110");
		map.put('E', "1111001100");
		map.put('F', "1111001000");
		map.put('G', "1111000000");
		map.put('A', "1110000000");
		map.put('B', "1100000000");

		int t = Integer.parseInt(sc.nextLine());
		while(t-- > 0) 
		{
			String current = "0000000000"; //當前指法
			int[] press = new int[10]; //計算每根手指按幾次
			String song = sc.nextLine();
			
			for(int i = 0; i < song.length(); ++i) //吹奏曲子
			{
				String finger = map.get(song.charAt(i));//音調指法
				
				for(int j = 0; j < 10; ++j) //從不壓到壓,計數一次
					if(finger.charAt(j) == '1' && current.charAt(j) == '0')
						press[j]++;
				
				current = finger; //更新當前指法
			}
			for(int i = 0; i < 9; ++i)
				System.out.print(press[i] + " ");
			System.out.println(press[9]);
		}
	}
}
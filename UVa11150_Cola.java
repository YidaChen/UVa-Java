/*
 * 3瓶空可樂罐可換1瓶新可樂,原本有n瓶,最多能喝到幾瓶?
 * 可借空瓶換新可樂,必須還同等借量 (2借1 換 1 還1)
 * */
import java.util.Scanner;

public class UVa11150_Cola {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()) 
		{
			int drink = sc.nextInt(); //一開始有的我都喝了
			int empty = drink; //空瓶數等於喝的瓶數
			
			while(empty > 1) //1個空瓶無法有借有還
			{
				if(empty == 2) empty++; //2空瓶我就能借1空瓶,還1空瓶
				
				int newCola = empty / 3;  //我能用現有空瓶換到幾瓶喝
				drink += newCola;
				empty = newCola + empty % 3; //喝掉的新空瓶+舊有空瓶
			}
			System.out.println(drink);
		}
	}
}
/*
 * 轉換10進位和16進位
 * */
import java.util.Scanner;

public class UVa10473_SimpleBaseConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) 
		{
			String str = sc.nextLine();
			if(str.charAt(0) == '-') break;
			
			if(str.charAt(0) == '0' && str.charAt(1) == 'x')
				System.out.println(Integer.parseInt(str.substring(2), 16));
			else
				System.out.println("0x"+Integer.toHexString(Integer.parseInt(str)).toUpperCase());
		}
	}
}
import java.util.Scanner;
/*
 * 打印出輸入的值於鍵盤左方2格的值
 * */
class UVa10222 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().toLowerCase();
		
		String key = "`1234567890-=qwertyuiop[]\\asdfghjkl;'zxcvbnm,./";
		
		for(int i = 0; i < str.length(); ++i) 
		{
			if(str.charAt(i) == ' ') 
				System.out.print(" ");
			else
				System.out.print(key.charAt(key.indexOf(str.charAt(i)) - 2));
		}
		System.out.println();
	}
}
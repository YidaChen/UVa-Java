/*
 * 將質因數分解式還原-1，再做質因數分解
 * */
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UVa516_PrimeLand {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) 
		{
			String str = sc.nextLine();
			if(str.equals("0")) break;
			
			String[] strArr = str.split(" ");
			int sum = 1;
			for(int i = 0; i < strArr.length; i+=2) 
			{
				int fac = Integer.parseInt(strArr[i]);
				int pow = Integer.parseInt(strArr[i+1]);
				sum *= Math.pow(fac, pow);
			}
			sum--;
			TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>(Collections.reverseOrder());
			for(int f = 2; f <= sum;) 
			{
				if(sum % f == 0) 
				{
					sum /= f;
					if(map.get(f) != null)
						map.put(f, map.get(f)+1);
					else
						map.put(f, 1);
				}
				else 
					++f;
			}
			StringBuilder sb = new StringBuilder();
			for(Map.Entry<Integer,Integer> e : map.entrySet())
				sb.append(e.getKey()+" "+e.getValue()+" ");
			
			System.out.println(sb.toString().trim());
		}
	}
}
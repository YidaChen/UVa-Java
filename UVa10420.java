/*
 * 計算每個國家出現的次數,並按字母排序打印出國家和出現次數
 * 解:使用 TreeMap (SortedMap)
 */
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class UVa10420 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int count = Integer.parseInt(sc.nextLine());
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		
		while(count-- > 0) 
		{
			String line = sc.nextLine();
			String country = line.substring(0, line.indexOf(' '));
			
			if(map.containsKey(country))
				map.put(country, map.get(country) + 1);
			else 
				map.put(country, 1);
		}
		for(Map.Entry<String, Integer> entry : map.entrySet()) 
		   System.out.println(entry.getKey() + " " + entry.getValue());
	}
}
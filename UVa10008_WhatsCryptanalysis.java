/*
 * 統計字母出現次數,並依次數排序打印
 * 解:用map統計次數,再將map存入list排序
 * */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

class UVa10008_WhatsCryptanalysis {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int count = Integer.parseInt(sc.nextLine());
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		while(count-- > 0) 
		{
			String str = sc.nextLine();
			
			for(int i = 0; i < str.length(); ++i) 
			{
				if(Character.isLetter(str.charAt(i))) 
				{
					char c = Character.toUpperCase(str.charAt(i));
					
					if(map.containsKey(c))
						map.put(c, map.get(c) + 1);
					else
						map.put(c, 1);
				}
			}
		}
		Set<Entry<Character, Integer>> set = map.entrySet();
		List<Entry<Character, Integer>> list = new ArrayList<Entry<Character, Integer>>(set);
		Collections.sort( list, new Comparator<Map.Entry<Character, Integer>>()
	    {
	        public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2)
	        {
	        	return (o2.getValue()).compareTo(o1.getValue());//Descending order
	        }
	    } );
		for(Map.Entry<Character, Integer> entry : list)
	        System.out.println(entry.getKey() + " " + entry.getValue());
	}
}
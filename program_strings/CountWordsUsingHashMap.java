package program_strings;

import java.util.HashMap;

public class CountWordsUsingHashMap {

	public static void main(String[] args) {
		
		String str = "hello i am learning automation i am";
		
		String[] split = str.split(" ");
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		for(String c : split){
			
			if(hm.containsKey(c))
			{
				hm.put(c, hm.get(c) +1);
			}
			else
			{
				hm.put(c, 1);
			}
		}
		System.out.println(hm);

	}

}

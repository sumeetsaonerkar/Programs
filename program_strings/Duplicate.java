package program_strings;

import java.util.HashMap;

public class Duplicate {
	
	public static void countDuplicate(String str){
		
		HashMap<String, Integer> hm = new HashMap<>();
		
		String[] s = str.split(" ");
				
		for(String temp : s){
			
			hm.put(temp, 1);
			
		}
		System.out.println(hm);
		
	}

	public static void main(String[] args) {
		
		countDuplicate("i am am learning selenium learning hard selenium");
	}

}

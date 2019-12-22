package program_strings;

import java.util.HashMap;

public class NoOfWordsUsingHM {

	public static void main(String[] args) {
		
		String str = "automation my name is sumeet name my my automation";
		String[] strArray = str.split(" ");
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for(int i=0; i<strArray.length; i++) {
			if(hm.containsKey(strArray[i])){
				int count = hm.get(strArray[i]);
				hm.put(strArray[i], count+1);
			}
			else{
				hm.put(strArray[i], 1);
			}
		}
		System.out.println(hm);

	}

}

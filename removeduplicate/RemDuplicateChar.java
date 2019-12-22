package removeduplicate;

import java.util.HashSet;

public class RemDuplicateChar{

	public static String removeDup(String str){
		
		HashSet<Character> set = new HashSet<Character>();
		StringBuffer sf = new StringBuffer();
		
		for(int i=0; i<str.length(); i++){
			Character c = str.charAt(i);
			if(!set.contains(c)){
				set.add(c);
				sf.append(c);
			} 
		}
			
		return sf.toString();
	}
	
	public static void main(String[] args) {
		
		String str="sumeet";

		System.out.println(removeDup(str));
		}

}

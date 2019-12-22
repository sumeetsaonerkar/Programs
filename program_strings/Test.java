package program_strings;

import java.util.HashMap;

public class Test {

	
	static void countWordsInString(String word){
		System.out.println("string is :- "+word);
		String[] aa= word.trim().split(" ");
		System.out.println("words in string is :- "+aa.length);
		
	}
	
	static void characterCountInString(String abc){
		
		// hello my name is hello my
		System.out.println("string length is :- "+abc.length());
		char ch[] = abc.toCharArray();
		
		for(int i=0; i<ch.length; i++){
			
			String s ="";
			
			while(i<ch.length && ch[i] != ' '){
				
				s = s + ch[i];
			     i++;
				
			}
			if(s.length()>0){
				System.out.println(s +":---"+ s.length());
				
		}
			
		}

	}
	static void withHashMap(String word){
		
		System.out.println(word);
		char aa[] = word.toCharArray();
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for(Character c : aa){
			
			if(hm.containsKey(c)){
				hm.put(c, hm.get(c)+1);
			}
			else
			{
				hm.put(c, 1);
			}
			
		}
		System.out.println(hm);
		
		
	}
	
	static void withNormalMethod(String word){
		
		System.out.println("string is :- "+word);
		System.out.println("duplicates are chars :- ");
		char ch[] = word.toCharArray();
		int count =0;
		
		for(int i=0; i<word.length(); i++){
			for(int j=i+1; j<word.length(); j++){
				
				if(ch[i] == ch[j]){
					
					System.out.println(ch[j]);
					count ++;
					break;
					
				}
			}
		}
		
		
	}
	public static void main(String[] args) {
		
	//	withHashMap("hellojava");
		//withNormalMethod("aabbklcc");
		//characterCountInString("hello my name is hello my");
		countWordsInString("my name is sumeet");
		
	}

}

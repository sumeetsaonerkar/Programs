package program_strings;

public class CharCountInString {
	
	static void count(String name){
	
		char[] ch = name.toCharArray();
		
		
		for(int i=0; i<name.length(); i++){
			
			String s ="";
		
			while(i<name.length() && ch[i] !=' '){
				
				s = s + ch[i];
				     i++;
				}
			
			if(s.length()>0){
				System.out.println(s +":---"+ s.length());
				
			}

		}
	}

	public static void main(String[] args) {
		
		String name = "As Hello World hjhj";
		System.out.println(name.length());
		
		count(name);
		
	}

}

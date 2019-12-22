package program_strings;

public class NoOfVowels {

	public static void main(String[] args) {
		
		String str = "apple orange banana";
		char[] ch = str.toCharArray();
		
		int count =0;
		
		for (char c : ch) {
			
			switch(c){
			
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				
				count ++;
				break;
					
			}
		}
		System.out.println("no of vowels are:- " +count);

	}

}

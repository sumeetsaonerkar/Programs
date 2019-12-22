package program_strings;

public class StringPalindrome {

	public static void main(String[] args) {
		
		String str = "sumeet";
		System.out.println(str);
		String rev = "";
		char[] ch = str.toCharArray();
		System.out.println("length is :-" +ch.length);
		for(int i=ch.length-1; i>=0; i--){
			
			rev = rev + ch[i];
	
		}
		
		System.out.println(rev);
		if(rev.equals(str)){
			System.out.println("string is palindrome");
		}
		else{
			System.out.println("not palindrome");
		}

	}

}

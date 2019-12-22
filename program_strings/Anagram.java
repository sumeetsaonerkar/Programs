package program_strings;

public class Anagram {
	
	static void isAnagram(String str1, String str2){
		
		String s1 = str1.replaceAll("\\s", "");
		String s2 = str2.replaceAll("\\s", "");
		System.out.println(s1 +"    "+ s2);
		
	}
 

	public static void main(String[] args) {
		
		isAnagram("Peek", "Keep");
		
	}
}

		



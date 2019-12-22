package program_strings;

public class FindDuplicateCharacterNormal {

	public static void main(String[] args) {

				String str = "suumm";
				char[] ch = str.toCharArray();
				int count =0;
				//System.out.println("duplicates characters in the string are :- ");
				System.out.println("String length is : "+str.length());
				//System.out.println("char at index 6 is :  "+str.charAt(6));
				for(int i=0; i<str.length(); i++){
					for(int j=i+1; j<str.length(); j++){
						
						if(ch[i] == ch[j]){
							
							System.out.println(ch[j]);
							count++;
							
							break;
						}
					}
				}

	}

}

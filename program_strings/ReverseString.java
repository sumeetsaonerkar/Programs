package program_strings;

public class ReverseString {

	public static void main(String[] args) {


		String name = "sumeet saonerkar";
		System.out.println("lenght is: " +name.length());
		
		String rev = "";
		
		for(int i=name.length()-1; i>=0; i--){
			char c = name.charAt(i);
			rev = rev + c;
			}
		
		System.out.println(rev+"\n");
		

	}

}

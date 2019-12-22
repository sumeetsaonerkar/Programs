package program_strings;

public class StringRevUsingFunction {

	public static void main(String[] args) {
		
		String str = "Automation testing";
		
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		sb = sb.reverse();
		System.out.println(sb);
		
		System.out.println((str.equals(sb)));
			
			
		
		

	}

}

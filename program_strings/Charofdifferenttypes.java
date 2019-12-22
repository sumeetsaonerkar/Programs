package program_strings;

public class Charofdifferenttypes {

	public static void main(String[] args) {
		String str = "!Mau1!7L&*i94";
		int acount=0;
		int ncount=0;
		int scount=0;
				
		for(int i=0; i<str.length(); i++){

		char ch = str.charAt(i);
		if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
		{
		acount++;
		} 

		else if(ch>='0' && ch<='9')
		{
		ncount++;
		}

		else
		{
		scount++;	
		}

		}
		System.out.println("Alphabets counts are  " + acount);
		System.out.println("Numericals counts are  " + ncount);
		System.out.println("Special Characters counts are  " + scount);
		}

	}
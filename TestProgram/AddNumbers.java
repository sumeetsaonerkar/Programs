package TestProgram;

public class AddNumbers {

	public static void main(String[] args) {
		
		int num = 123;
		int sum = 0;
		int n;
		while(num > 0)
		{
			
			n = num%10;
			sum = sum +n;
			num = num/10;
		}	
		
	
	System.out.println(sum);

	}

}

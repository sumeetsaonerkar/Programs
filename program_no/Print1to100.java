package program_no;

public class Print1to100 {

	public static void main(String[] args) {
	
		
		for(int i=1; i<=100; i++)
		{
			System.out.println(i);
			if(i%3 == 0 )
			{
				System.out.println("divisible by: 3 - " +i);
			}
			if(i%5 ==0)
			{
				System.out.println("divisible by: 5 - " +i);
			}
		}
		

	}

}

package program_no;

public class Fibonacci {

	public static void main(String[] args) {
		
		int n=5; int a = 0, b = 1;
		
		System.out.print(a +" " +b);
		
		for(int i=1; i<=n; i++){
			
			int sum = a + b;
			System.out.print(" " +sum);
			     a = b;
			     b = sum;
		}

	}

}

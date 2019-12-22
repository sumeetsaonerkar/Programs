package arrays;

public class Secondlargest {

	public static void main(String[] args) {
			
		int[] a = {200, 150, 30, 40, 500, 450};
		int largest =a[0];
		int secondlargest = a[0];
		
		System.out.println("array elements are :- ");
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		for(int i=0; i<a.length; i++)
		{
			if(a[i] > largest){
				secondlargest = largest;
				largest = a[i];
			}
			else if(a[i] > secondlargest){
				
				secondlargest = a[i];
			}
		}
		System.out.println("second largest number is :- "+secondlargest);
	}

}

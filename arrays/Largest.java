package arrays;

public class Largest {

	public static void main(String[] args) {
		
		int[] a = {10, 2, 20, 30, 40, 500};
		int largest =a[0];
		
		System.out.println("array elements are :- ");
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
			if(a[i] > largest){
				
				largest = a[i];
				
			}
		}
		System.out.println("largest is :- "+largest);

	}

}

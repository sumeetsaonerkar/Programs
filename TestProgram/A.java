package TestProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A extends Demo {
	
	

	public static void main(String[] args) {
		
		Demo d = new Demo();
		d.m1();
		
		
	
		 
		List<String> a1 = new ArrayList<>(Arrays.asList("A", "B", "C"));
		
		List<String>  a2 = a1;
		a2.add("C");
		
		System.out.println(a1.size());
		System.out.println(a2.size());
		

	}

}

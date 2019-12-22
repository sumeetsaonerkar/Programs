package arraylistcollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String args[]){
	ArrayList<Integer> a = new ArrayList<Integer>();
	a.add(2);
	a.add(3);
	a.add(4);
	a.add(2);
	a.add(9);
	System.out.println("before" +a);
	
	// Unboxing - Converting an object of a wrapper type to its corresponding primitive value is called unboxing. For example conversion of Integer to int. 
	// to remove content we have to use autoboxing or unboxing concept. 
	// Autoboxing: Converting a primitive value into an object of the corresponding wrapper class is called autoboxing.
	//Eg: converting int to Integer class. 
	
	//a.remove(9); // this is deleting index.
	a.remove(new Integer(9));
	a.remove(3);         // will remove element on basis of index
	System.out.println(a);
	
	
	
	
	//a.remove(1);
	//a.remove(2);
	
	//System.out.println(a);
	
	/*Set<Integer> primesWithoutDuplicates = new LinkedHashSet<Integer>(a);
	
	System.out.println(primesWithoutDuplicates);
	a.clear();
	System.out.println(a);
	
	System.out.println(a);
	
	
	a.addAll(primesWithoutDuplicates);
	System.out.println(a);
	*/
	}
}

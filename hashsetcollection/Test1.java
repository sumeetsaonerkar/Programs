package hashsetcollection;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test1{
	
	public static void main(String[] args) {
	
				
		HashSet<Object>  a = new HashSet<>();
		
		a.add(null);
		a.add("sumeet");
		System.out.println(a.add(20));      // does not print duplicates 
		a.add(20);
		a.add(200);
		a.add("abc");
		System.out.println(a);
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		System.out.println(a.contains("sumeet"));
		
		HashSet<Object>  a1 = new HashSet<>();
		a1.add("param");
		a1.add("sidd");
		a1.add("sumeet");
		a1.add(90);
		System.out.println(a1);
		//a.addAll(a1);
		a.retainAll(a1);
		System.out.println(a);
	}


}

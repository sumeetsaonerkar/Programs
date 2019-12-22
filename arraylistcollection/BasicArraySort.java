package arraylistcollection;
import java.util.ArrayList;
import java.util.Collections;

public class BasicArraySort {

	public static void main(String[] args) {
		  ArrayList<String>  list = new ArrayList<String>(); 

      // Populate the ArrayList 
      list.add("param"); 
      list.add("sumeet"); 
      list.add("abc"); 
      list.add("ashraddha"); 
      list.add("zandu"); 

      // Print the unsorted ArrayList 
      System.out.println("Unsorted ArrayList: "
                         + list); 

      // Sorting ArrayList in ascending Order 
      // using Collection.sort() method 
      Collections.sort(list); 

      // Print the sorted ArrayList 
      System.out.println("Sorted ArrayList "
                         + "in Ascending order : "
                         + list); 
      Collections.sort(list, Collections.reverseOrder());
      System.out.println(list);
	
	}
	

}

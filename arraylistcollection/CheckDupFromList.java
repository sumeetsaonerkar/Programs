package arraylistcollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CheckDupFromList {

	public static void main(String[] args) {
		
		List<String> al = new ArrayList<String>();
		al.add("sumeet");
		al.add("abc");
		al.add("xyz");
		al.add("param");
		al.add("sumeet");
		al.add("abc");

		for(int i=0; i<al.size(); i++)
		{
			for(int j=i+1; j<al.size(); j++){
				
				if(al.get(i).equals(al.get(j)))
				{
					System.out.println(al.get(i));
				}
			}
		}
	
	}

}

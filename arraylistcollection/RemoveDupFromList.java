package arraylistcollection;

import java.util.ArrayList;

public class RemoveDupFromList {

	public static void main(String[] args) {
		
		ArrayList<Object> al = new ArrayList<Object>();
		al.add("sumeet");
		al.add("abc");
		al.add("xyz");
		al.add("param");
		al.add("sumeet");
		al.add("abc");
		
		for(int i=0; i<al.size(); i++)
		{
			for(int j=i+1; j<al.size(); j++)
			{
				if(al.get(i).equals(al.get(j))){
					al.remove(j);
					j--;
				}
			}
		}

		System.out.println(al);
	}

}

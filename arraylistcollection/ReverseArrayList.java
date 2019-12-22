package arraylistcollection;

import java.util.ArrayList;

public class ReverseArrayList {

	public static void main(String[] args) {
		
		String rev = "";
		ArrayList<Object> al = new ArrayList<Object>();
		al.add("sumeet");
		al.add("abc");
		al.add("xyz");
		al.add("param");
		al.add("sidd");
		al.add("abc");
		
		System.out.println(al);
		for(int i=al.size()-1; i>=0; i--){
		
			rev =(String) al.get(i);			// .get method is returning string so to convert it into object  we have to typecast
	
			System.out.println(rev);
		}
	}

}

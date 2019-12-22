package arraylistcollection;

import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {
		
		ArrayList<Object> al = new ArrayList<Object>();
		al.add("sumeet");
		al.add("abc");
		al.add("xyz");
		al.add("param");
		al.add("Sumeet");
		
		String arr[] = new String[al.size()];
		System.out.println("length is :- "+arr.length);
		
		for(int i=0; i<al.size(); i++)
		{
			arr[i] =(String) al.get(i);
		}
		
		for(String s : arr)
		{
			System.out.println(s);
		}
	
	}

}

package arraylistcollection;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveNumberIterator {

	static int number;
	public static void main(String args[]){
		
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(200);
		a.add(300);
		a.add(400);
		a.add(121);
		a.add(900);
		System.out.println("before delete" +a);
		
		Iterator itr = a.iterator();
		while(itr.hasNext()){
			 number = (Integer)itr.next();
			 if(number%2 == 0)
			 {
				 itr.remove();
			 }
			 	}
		System.out.println(a);
}
}






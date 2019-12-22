package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		
		LinkedList<Integer> li = new LinkedList<Integer>();
		li.add(10);
		li.add(2);
		li.add(70);
		li.add(120);
		Iterator itr = li.descendingIterator();               // prints into reverse order 
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

	}

}

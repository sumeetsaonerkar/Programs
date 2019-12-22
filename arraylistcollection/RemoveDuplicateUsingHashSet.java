package arraylistcollection;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicateUsingHashSet {

	public static void main(String[] args) {

		ArrayList<String> duplicateList = new ArrayList<String>();
		duplicateList.add("sumeet");
		duplicateList.add("param");
		duplicateList.add("sidd");
		duplicateList.add("param");
		
		System.out.println(duplicateList);
		
		HashSet<String> listToSet = new HashSet<String>(duplicateList);
		
		ArrayList<String> withOutDuplicate = new ArrayList<String>(listToSet);
		System.out.println("withoout duplicate : " +withOutDuplicate);
		
	}

}

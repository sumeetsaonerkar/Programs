package TestProgram;

public class emp extends TeamLead {

	
	void printDetails(){
		
		super.display();
		
		String s[] = {"a", "b", "c", "d"};
		System.out.println(s[0]);
	}
public static void main(String[] args) {
		
	emp e1 = new emp();
	e1.printDetails();

	}
}

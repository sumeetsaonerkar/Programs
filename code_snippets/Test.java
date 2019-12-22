package code_snippets;

public class Test {
	
	 int i=8;
	 int j=9;

	public static void main(String[] args) {
		
		add();

	}
	
	public static void add(){
		
		Test t = new Test();
		
		//int k = i+j;		// cant be possible as "i" & "j" is not static 
		//System.out.println(k);
	}

}

package TestProgram;

public class TestSpace {
	
	static void m1(){
		System.out.println("with replaceAll function  :- ");
		String s = "sumeet saonerkar learning java";
		s = s.replaceAll("\\s", "");
		
		System.out.println(s);
		
	}
	
	static void m2(){
		System.out.println("without replace function :- ");
		String s = "sumeet saonerkar learning ha ha ha ha";
		
		char[] chars = s.toCharArray();
		
		StringBuffer sb = new StringBuffer();
		
		for(int i=0; i<chars.length; i++){
			
			if((chars[i] !=' ') && (chars[i] != '\t')){
				sb.append(chars[i]);
			}
		}
		System.out.println(sb);
		
	}
	
	

	public static void main(String[] args) {
		
				//m1();
				m2();


	}

}

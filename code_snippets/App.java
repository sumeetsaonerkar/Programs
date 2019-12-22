package code_snippets;

public class App extends Super {

	protected int b;
	
	public App(int index) {
        index = index;
        
    }
	public static void main(String[] args) {
		
		App myApp = new App(10);
        System.out.println(myApp.index);
        System.out.println(myApp.b);
	}

}

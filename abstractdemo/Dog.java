package abstractdemo;

// class extends abstract class

public class Dog extends Animal {

	public static void main(String[] args) {
		
	Animal obj = new Dog();
		obj.sound();
		obj.breathe();
		
		
		
		
		

	}

	@Override
	public void sound() {
		System.out.println("bark");
		}

	@Override
	public void breathe() {
		
	}


}

package superkeyword;

public class Car extends WithVariable {
	
	int maxSpeed = 180; 
	  
   public void display() 
    { 
	   super.display();
      System.out.println("this is current class display method i.e CAR Class");
      
	   /* print maxSpeed of base class (vehicle) */
        System.out.println("Maximum Speed: " + super.maxSpeed); 
    } 

}

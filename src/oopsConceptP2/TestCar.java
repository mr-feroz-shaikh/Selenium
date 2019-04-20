package oopsConceptP2;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	BMW b= new BMW();
	
	// This is called compile time/static polymorphism. Overridden methods, parent class methods and child class methods are accessed.
	b.start(); // this method overrides method of car class.
	b.stop(); // this method overrides method of car class.
	b.service(); // this method is inherited by BMW from Car.
	b.display(); // this method is of parent of Car
	
	System.out.println("******************");
	
	Car c = new Car();
	c.start();
	
	System.out.println("******************");
	
	// This is called runtime/dynamic polymorphism. In this only overridden methods and parent class methods are accessed.
	Car c1 = new BMW(); // child class object can referenced by parent class reference variable
	c1.start();// Overridden method of BMW is called. 
	c1.stop(); // Overridden method of BMW is called. 
	c1.service(); //  this method is inherited by BMW from Car.
	
	
	}

}

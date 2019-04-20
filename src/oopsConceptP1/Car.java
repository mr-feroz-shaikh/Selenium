package oopsConceptP1;

public class Car {

	
	int mod; //global variable
	int wheel;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// new Car() is object for class car
		// a,b,c is object reference variable (This is not object)
		
		int mod=2015; //local variable
		
		Car a=new Car(); 
		Car b=new Car();
		Car c=new Car();
		
		a.mod=2019;
		a.wheel=4;
		
		b.mod=2014;
		b.wheel=4;
		
		c.mod=2013;
		c.wheel=4;
		
		
		
	System.out.println(a.mod + "+++"+ mod);
	System.out.println(a.wheel);
		
	System.out.println(b.mod);
	System.out.println(b.wheel);
	
	System.out.println(c.mod);
	System.out.println(c.wheel);
	
	a=b; //object reference of b is assigned to a.
	b=c; //object reference of c is assigned to b.
	c=a; //object reference of a is assigned to c .For b object representation by a,c. For a object no representation.
	
	
	
	}

}

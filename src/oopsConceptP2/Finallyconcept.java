package oopsConceptP2;

public class Finallyconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	display();
		
		
	}

public static void display()
{
	int i=0;
	
	try {
		
		int k =i%0;
		
		
	} /*catch(ArithmeticException e)
	{
		System.out.println("Divide by zero Exception ");
	}*/
	
	catch(NullPointerException e) {
		
		System.out.println("This wont execute as Arithmetice exception is thrown");
	}
/*	catch(Exception e)
	{
		System.out.println("Exception normal");
	}*/

	finally {
		
		System.out.println("Exception happens or not it will execute");
	}

}
	
}

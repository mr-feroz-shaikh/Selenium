package oopsConceptP2;

public class Finalconcept {

	
	static final int f=100; //for declaring global final variable it must be static -Constant variable
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	final int f1=300; //final variable can be declared as local constant variable.
	Finalconcept fc=new Finalconcept();
	
	fc.display();
	
	
	System.out.println("f"+Finalconcept.f);
	System.out.println("f"+f1);	
		
		
	}

	public final void display()
	{
		
		System.out.println("Final Method");
	}


}





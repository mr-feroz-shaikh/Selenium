package oopsConceptP1;

public class StaticNonstatic {

	static int s=55; //this value will be same for every object
	String St="Non Static";
	int s1=40; // this value will be different for every object

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticNonstatic sn=new StaticNonstatic();
		StaticNonstatic sn1=new StaticNonstatic();
		
		display(); 
		StaticNonstatic.display();
		StaticNonstatic.s=56; //we can change value of static variable it will changed across the class.
		
		System.out.println("Static integer"+ StaticNonstatic.s);
		System.out.println("Static integer"+ s);
		System.out.println("Static integer"+ sn.s); //gives warning as object reference variable is used to called static member.
		
		System.out.println("s1"+sn.s1);
		
		sn1.s1=42;
		System.out.println("s1"+sn1.s1);
		System.out.println("s1"+sn.s1);
	}

	static void display()
	{
		System.out.println("Static Funtion");
	}
}



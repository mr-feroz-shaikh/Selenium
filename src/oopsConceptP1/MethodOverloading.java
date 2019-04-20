package oopsConceptP1;

public class MethodOverloading {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloading m = new MethodOverloading();
		m.sum(4.2);
		m.sum(5, 10);
	
	
}
	
public static void main(int a) // Main method also can be overloaded.
{
	
}


// Method overloading is having same method name with different parameters within same class.	

void sum(int a)
{
	System.out.println("a" + a);
}

void sum(double a)
{
	System.out.println("a" + a);
}

int sum(int a, int b)
{
	System.out.println("a"+a+"b"+b);
	
	return b;
	
 }

}

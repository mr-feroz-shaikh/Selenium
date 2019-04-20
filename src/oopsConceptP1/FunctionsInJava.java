package oopsConceptP1;

public class FunctionsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//non static methods.		

	FunctionsInJava f = new FunctionsInJava(5.2);
	
	f.test();
	f.test(8);
	int c=f.testint();
	int d= f.testint(15);

	System.out.println("C"+c+"D"+d+"");

}

	
	public FunctionsInJava(double con) //Constructor of class
	{
		int cos=50;
		System.out.println("Constructor test"+con+"   "+cos);
		
	}
public void test() 
{
	 System.out.println("Function with no ip and op");
	 
}
		
public int test(int m) // method overloading has same method name, only difference input parameters.
{
	System.out.println("Function with ip but no return type" + m);
	int m1=10;
	return m1;
			
}

public int testint()
{
    int n=5;
    System.out.println("Function with no ip but return type"); 
    
	return n;
 
}

public int testint(int a)
{
    int b=10;
	
    System.out.println("Function with ip and return type"); 
    return a=b; 
	
}


}
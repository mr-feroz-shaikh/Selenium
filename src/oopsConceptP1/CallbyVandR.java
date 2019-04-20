package oopsConceptP1;


public class CallbyVandR {

	int a=15;
	int b=30;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=20;
		
		CallbyVandR vr= new CallbyVandR();
		int c=vr.testsum(a, b); //call by value or pass by value
		System.out.println("Call by value" +c);
	
		vr.swap(vr);
	}

	public int testsum(int a, int b)
	{
		
		int c= a+b;
		
		return c;
		
	}
	
	public void swap(CallbyVandR cr)
	{
		int temp;
		
		temp =cr.a;
		cr.a=cr.b;
		cr.b=temp;
	System.out.println("a, b" +a +b);	
	System.out.println("" + cr.a + cr.b);
 }
 
}
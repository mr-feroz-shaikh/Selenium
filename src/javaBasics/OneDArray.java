package javaBasics;

public class OneDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	int i[]= new int[3];
	
	i[0]=1;
	i[1]=2;
	i[2]=2;
	
	System.out.println(""+i.length);
	
	for(int j=0; j<i.length; j++)
	{
		
		
		System.out.println(" " + i[j] );
	}
		
	double d[] = new double[3];

	d[0] = 12.3;
	d[1] = 22.4 ;
	d[2] = 33.5 ;

	boolean b[] = new boolean[2];
	b[0]= true;
	b[1]= false;
	
	char c [] = new char[2];

	c[0]='a';
	c[1]='b';
	//c[2]='c';

	String s[] = new String [2];
	s[0]="Test";
	s[1]="Testing";

	/* One dimensional array, lower bound is zero, upper bound is 2. If we try to fetch i[3] then array out of bound exception occurs.
	Lower bound in array =0
	Upper bound in array = n-1, where n is size of array.
	For getting length of array function is “i.length”.
	Array is used to store similar data types values in a array variable. */

	Object ob[] = new Object[4];
	
	ob[0]="Test";
	ob[1]=2;
	ob[2]=22.3;
	ob[3]='T';
	
	// object array is used store different data types.
	
	
	
	
	
	}

}

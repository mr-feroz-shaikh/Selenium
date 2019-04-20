package dataStructures;
import java.util.*;

public class ArrayListC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	ArrayListC al= new ArrayListC();
	
	ArrayList ar= new ArrayList(); //dynamic array with size and different types of data.
	
	ar.add(10); //0
	ar.add("Hello"); //1
	ar.add('H'); //2
	ar.add(true); //3
	ar.add(22.34);//4
	
	System.out.println("Size" +ar.size());
	
	ar.add(10); //5
	ar.add("Hello");//6
	
	System.out.println("Size" +ar.size());
	System.out.println("Value" + ar.get(4));
	
	
	
	int i[]= new int[4];
	int j[][]=new int[2][3];
	String s1[]= new String[2];
	String s2[][] = new String[2][2];
	
	for(int k =0; k<ar.size(); k++)
	{
		
		System.out.println("" +ar.get(k));
	}
	
	
	ArrayList<Integer> ar1 = new ArrayList<Integer>(); // restrict to only one data type.
	
	
	
	
	
	}

}

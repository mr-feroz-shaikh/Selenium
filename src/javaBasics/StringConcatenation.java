package javaBasics;

public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


int a=100; int b=200;

String x= "Hello"; String y= "World";

		System.out.println(a+b+x+y);
		
		System.out.println(x+y+a+b);
		
		System.out.println(x+y+(a+b));
		
		System.out.println(a+b+x+y+a+x+b+y);
//whenever we add string to integer then that integer became string. + is called concatenation operator.		
		
		System.out.println("The value is of a=" + a);
		
	}

}

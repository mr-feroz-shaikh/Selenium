package oopsConceptP1;

public class WrapperClass {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String s ="100";
	System.out.println(s+20); // It gives output in string value as 10020, due to concatenation operator
	int i=Integer.parseInt(s); //Converts String into integer
	
	System.out.println(i+20+"String"+10+10+10+10); //Once string added to integer then it gets converted into string.
	
	String d ="200";
	double dv=Double.parseDouble(d); // Converts string into double
	System.out.println(+dv+20.5);
	
	String b ="true";
	boolean bv = Boolean.parseBoolean(b);
	System.out.println(bv);
	
	int j =200;
	String js= String.valueOf(j); // Converts integer value to the string
	System.out.println(j+js);
	
	String st="100A";
	//Integer.parseInt(st); // Gives Number format exception as String is not pure integer value.
	
	
	}

}

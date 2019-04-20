package oopsConceptP1;

public class LocalGlobalVar {

	// Global Variable as non static variables

	int Gvint = 5;
	String Gvstring = "Global";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalGlobalVar lm = new LocalGlobalVar();// Object reference variable created outside main method can't use in
													// main method.

		int Mvint = 6;
		String Mvstring = "Main Variable";

		System.out.println("Main Int Var  " + "  " + Mvint + "  " + "Main VariableString   " + "  " + Mvstring);

		System.out.println("Global Var Int  " + lm.Gvint + "  " + "Global Var String   " + lm.Gvstring);

	}

}

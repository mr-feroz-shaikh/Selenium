package oopsConceptP3;

public class ClassC extends ClassM {

	public ClassC() {
		// TODO Auto-generated constructor stub
		super(10, 3);
		System.out.println("Child Class Constructor");

	}

	public ClassC(int a, int b) {
		System.out.println("Child class constructor2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassM c = new ClassC();

		c.disp();
		
	}

}

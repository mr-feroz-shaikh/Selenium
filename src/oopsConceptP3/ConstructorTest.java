package oopsConceptP3;

public class ConstructorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorTest ct = new ConstructorTest();
		ConstructorTest ct1 = new ConstructorTest(10, 20);
		ConstructorTest ct2 = new ConstructorTest(30.2, 40);

	}

	public ConstructorTest() {

		System.out.println("Test Constructor");

	}

	public ConstructorTest(int i, int j) {

		System.out.println("i,j" + i + j);

	}

	public ConstructorTest(double i, int j) {

		System.out.println("i,j" + i + j);

	}

}

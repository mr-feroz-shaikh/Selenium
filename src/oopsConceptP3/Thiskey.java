package oopsConceptP3;

public class Thiskey {

	String name;
	int age;

	public Thiskey(String name, int age) {
		this.name = name;
		this.age = age;

		System.out.println("name, age" + name + age);

	}

	public void fn(String name, int age) {

		this.name = name;
		this.age = age;

		System.out.println("name, age" + name + age);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thiskey t = new Thiskey("name", 39);
		t.fn("name", 30);

		System.out.println("name and age class var" + t.name + t.age);

	}

}

package oopsConceptP2;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

HSBCBank hs=new HSBCBank();

System.out.println("Compile time polymorphism********");

//compile time polymorphism overridden and child class methods are called
hs.credit();
hs.debit();
hs.transferm();
hs.carloan(); //child class method of HSBC
hs.mutualfund(); //Parent interface method of BrazilBank


System.out.println("Run time polymorphism**********");

//Runtime polymorphism overridden methods called and child class methods are not called.
USBank us=new HSBCBank(); //child class object is assigned to parent interface reference variable. 

us.credit();
us. debit();
us.transferm();
//us.carloan(); This is child class method. Gives error as this method is not defined for USBank.

System.out.println("Min Bal" +USBank.mbal);	//static variable should be accessed using class.variablename.

//USBank.mbal=200; Interface variable is static and final(constant) in nature and can't be changed.
	

	
	}


	
}

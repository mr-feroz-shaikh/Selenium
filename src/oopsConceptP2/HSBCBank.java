package oopsConceptP2;

public class HSBCBank implements USBank, BrazilBank {

	
	public void credit() //us bank interface methods
	{
		
		System.out.println("US Bank Credit method");
	}
	
	public void debit() // us bank interface method
	{
		
		System.out.println("US Bank Debit method"+USBank.mbal);
	}
	
	public void transferm() // us bank interface method
	{
		System.out.println("US Bank transfer method" + mbal);
	}

 public void carloan() // HSBC class method
 {
	 System.out.println("Carloan");
 }

 //Brazil Bank interface methods
 public void mutualfund()
 {
	 System.out.println("Brazil Bank Interface method");
 }
 
 
}

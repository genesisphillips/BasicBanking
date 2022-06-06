package hw05;
public class SavingsAccount extends Account {
	private int transLimit = 5000;

	// constructor
	SavingsAccount(int newActNumber, double newBalance){
		super (newActNumber, newBalance);
		}
	
	
	// GETLIMIT()
	public int getTransLimit (){

		return transLimit;
	}
		
		
	// SETLIMIT()
	public void setTransLimit (int newTransLimit){
		transLimit = newTransLimit;
	}
		
	
	// WITHDRAW OVERRIDE
	@Override
	public void withdraw(double amount){
	if(balance < amount)
	{
	System.out.println("The amount has excessed the transaction limit: " + transLimit);
	}
	else
	{
	super.withdraw(amount);
	}
	}
	
	
	// TOSTRING OVERRIDE
	@Override
	public String toString()
	{
	String res = "Savings";
	res += super.toString();
	return res;
	}



}

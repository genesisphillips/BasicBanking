package hw05;
public class CheckingAccount extends Account {
	private int overDraftLimit = 500;
	
	// constructor
	CheckingAccount(int newActNumber, double newBalance){
		super (newActNumber, newBalance);
		
	}
	
	
	// GETLIMIT()
	public int getLimit (int overDraftLimit){

		return overDraftLimit;
	}
	
	
	// SETLIMIT()
	public void setLimit (int newDraftLimit){
		overDraftLimit = newDraftLimit;
	}
	
	
	// WITHDRAW OVERRIDE
	@Override
	public void withdraw(double amount){
	if(amount - balance > overDraftLimit)
	{
	System.out.println("The amount has excessed the overdraft limit: " + overDraftLimit);
	}
	else
	{
	super.withdraw(amount);
	}
	}
	
	
	// TOSTRING OVERRIDE
	@Override
	public String toString(){
	String over = "Checking";
	over += super.toString();
	return over;
	}
	
	
	
	
}

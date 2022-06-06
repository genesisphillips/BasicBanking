package hw05;
import java.util.Date;
public class Account {
	// data
	public int actNumber;
	public double balance;
	public Date dateCreated;
	
	// constructor
	Account (){
		dateCreated = new java.util.Date();
	}
	
	// ACCOUNT ()
	public Account (int newActNumber, double newBalance){
		super();
		actNumber = newActNumber;
		balance = newBalance;
		dateCreated = new java.util.Date();
	}
	
	
	// GETACTNUMBER()
	public int getActNumber(){
		return actNumber;
	}
	
	
	// GETBALANCE()
	public double getBalance(){
		return balance;
	}
	
	
	// GETDATECREATED()
	public Date getDateCreated(){
		return dateCreated;
	}
	
	// WITHDRAW ()
	public void withdraw(double amount){
		balance = getBalance() - amount;
	  }
	
	// DEPOSIT()
	public void deposit(double amount){
		balance = getBalance() + amount;
	}
	
	
	
	
	
	}

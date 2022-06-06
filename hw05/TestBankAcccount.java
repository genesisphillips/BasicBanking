package hw05;
public class TestBankAcccount {

	public static void main(String[] args) {
		
		// Create new checking/savings accounts
		CheckingAccount checking = new CheckingAccount(454, 1000);
		SavingsAccount savings = new SavingsAccount (824, 6000);
		
		// Print the checking account and it's current balance
		System.out.println(checking.toString());
		System.out.println(checking.getBalance());
		
		// Test checking withdraw method
		checking.withdraw(500);
		System.out.println(checking.getBalance());
		checking.withdraw(1200);
		
		// Test checking get overdraft limit method
		checking.setLimit(1000);
		checking.withdraw(1200);
		System.out.println(checking.getBalance());
		
		// Print savings account and it's current balance
		System.out.println(savings.toString());
		System.out.println(savings.getBalance());
		
		// Test the savings withdraw method
		savings.withdraw(2000);
		System.out.println(savings.getBalance());
		
		savings.withdraw(6000);
		savings.withdraw(4500);
		
		// Test saving get transaction limit
		System.out.println(savings.getTransLimit());
		
		// Set new savings transaction limit
		// then try withdraw again
		savings.setTransLimit(4000);
		savings.withdraw(4000);
		System.out.println(savings.getBalance());
		
		// Test the savings deposit method
		savings.deposit(750.5);
		System.out.println(savings.getBalance());
		
		// Print detail checking information
		System.out.println(checking.toString());
		System.out.println(checking.getActNumber());
		System.out.println(checking.getDateCreated());
		
		

	}

}

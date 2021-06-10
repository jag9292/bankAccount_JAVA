package BankAccount;

public class BankAccountTest {

	public static void main(String[] args) {		
		BankAccount account1 = new BankAccount();
		account1.deposit(100, "Checking");
		account1.deposit(500, "Savings");
		account1.withdraw(1200, "Checking");
		
		BankAccount account2 = new BankAccount();
		account2.deposit(1000, "Checking");
		account2.deposit(100, "Savings");
		account2.withdraw(1200, "Checking");

		System.out.println(BankAccount.getNumberOfMembers());
		
		System.out.println(account1.checkBalance());
		System.out.println(account2.checkBalance());
		
		System.out.println(BankAccount.getTotalAccountsBalances());
		
		
	}

}

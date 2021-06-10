package BankAccount;
import java.util.Random;


public class BankAccount {
	private String accountNumber;
	private Double checkingBalance;
	private Double savingsBalance;
	private static int numberOfMembers = 0;
	private static Double totalAccountsBalances = 0.00;
	
	public BankAccount() {
		this.accountNumber = this.generateAccountNumber();
		this.checkingBalance = 0.00;
		this.savingsBalance = 0.00;
		numberOfMembers++;
		totalAccountsBalances += this.checkingBalance += this.savingsBalance; 
	}

	public static void setNumberOfMembers(int numberOfMembers) {
		BankAccount.numberOfMembers = numberOfMembers;
	}
	public static int getNumberOfMembers() {
		return numberOfMembers;
	}
	
	public static void setTotalAccountsBalances(Double totalAccountsBalances) {
		BankAccount.totalAccountsBalances = totalAccountsBalances;
	}
	public static Double getTotalAccountsBalances() {
		return totalAccountsBalances;
	}
	
	public String generateAccountNumber() {
		Random rand = new Random();
		int rand_int;
		String result = "";
		for(int i=0; i<10; i++) {
			rand_int = rand.nextInt(10);
			result+=rand_int;
		}
		return result;
	}
	
	public Double memberTotal() {
		Double total = this.checkingBalance += this.savingsBalance;
		return total;
	}
	
	public String checkBalance() {
		String result = ("AccountNumber:" + this.accountNumber + "\r" + "Checking: " 		+ this.checkingBalance + "\r" + "Savings: " + this.savingsBalance + "\r" + "Balance Total: " + memberTotal());
		return result;
	}
	
	public void deposit(int num, String acc) {
		if(acc.equals("Checking")) {
			this.checkingBalance += num;
		}
		if(acc.equals("Savings")) {
			this.savingsBalance += num;
		}
		totalAccountsBalances += num;
	}
	
	public void withdraw(int num, String acc) {
		if(acc.equals("Checking")) {
			if(this.checkingBalance >= num) {
				this.checkingBalance -= num;
			}
			else {
				System.out.println("Not enough moneys");
				return;
			}
		}
		if(acc.equals("Savings")) {
			if(this.savingsBalance >= num) {
				this.savingsBalance -= num;
			}
			else {
				System.out.println("Not enough moneys");
				return;
			}
		}
	}
	
	
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Double getCheckingBalance() {
		return checkingBalance;
	}

	public void setCheckingBalance(Double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}

	public Double getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(Double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}


}
package hw4classes;

public class Account {
	private AccountHolder name;
	private double Balance;
	
	public Account(AccountHolder name, double balance) {
		super();
		this.name = name;
		Balance = balance;
	}
	
	public void deposit(double amt) {
		this.Balance = this.Balance + amt;
	}
	
	public void withdraw(double amt) {
		this.Balance = this.Balance - amt;
	}

	public AccountHolder getName() {
		return name;
	}

	public void setName(AccountHolder name) {
		this.name = name;
	}

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double balance) {
		Balance = balance;
	}
}

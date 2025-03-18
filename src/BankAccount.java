public class BankAccount{
	private String accountHolder;
	private double balance;
	
	//Constructor
//	public BankAccount() {
//		System.out.println("Default Constructor");
//	}//default constructor
	
	//parameterized constructor
	public BankAccount(String accountHolder,double balance) {//a = KZT,b=100.0
		this.accountHolder = accountHolder;//accountHolder = KZT
		this.balance = balance;//balance = 100.0
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {//amount=1000.0
		balance += amount;
		System.out.println("Deposited: "+amount+",New Balance; "+getBalance());
	}
	
	public void withdraw(double amount) {
		balance -= amount;
		System.out.println("Withdrawn: "+amount+",Remaining Balance; "+getBalance());
	}
	
	//method
	public void displayResults() {
		System.out.println("Welcome From Our Banking");
		System.out.println(accountHolder);
		System.out.println(balance);
	}
}
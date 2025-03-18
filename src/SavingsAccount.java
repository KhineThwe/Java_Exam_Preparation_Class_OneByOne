//inheritance
public class SavingsAccount extends BankAccount{
	private double interestRate;

	public SavingsAccount(String accountHolder, double balance,double interestRate) {
		super(accountHolder, balance);
		// TODO Auto-generated constructor stub
		this.interestRate = interestRate;
	}
	
	public void addInterestRate() {
	     double interest = getBalance() * interestRate;
	     deposit(interest);
	     System.out.println("Interest added; "+interest+",Your New Balance: "+getBalance());
	}
	

}

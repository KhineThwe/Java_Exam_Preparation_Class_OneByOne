public class BankSystem {

	public static void main(String[] args) {
		BankAccount bankAcc = new BankAccount("KZT",10000.0);//obj 
		bankAcc.displayResults();	
		
		bankAcc.deposit(1000.0);
		bankAcc.withdraw(100.0);
		
		SavingsAccount savingAcc = new SavingsAccount("Jame",5000.0,0.08);
		savingAcc.addInterestRate();
	}

}

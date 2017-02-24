
public class SavingsAccount {
	public static double annualInterestRate;
	private double savingsBalance;
	
	public SavingsAccount() {}
	
	public SavingsAccount(double balance) {
		// TODO Auto-generated constructor stub
		savingsBalance = balance;
	}
	
	public double calculateMonthlyInterest() {
		double m = savingsBalance * annualInterestRate / 12.0;
		savingsBalance += m;
		return m;
	}
	
	public static void modifyInterestRate(double newValue) {
		annualInterestRate = newValue;
	}
	
	public void setSavingsBalance(double balance) {
		savingsBalance = balance;
	}
	
	public double getSavingsBalance() {
		return savingsBalance;
	}
}


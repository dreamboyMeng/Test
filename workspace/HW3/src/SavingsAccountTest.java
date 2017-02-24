
public class SavingsAccountTest {
	public static void main (String[] args) {
		SavingsAccount saver1 = new SavingsAccount(2000.00);
		SavingsAccount saver2 = new SavingsAccount(3000.00);
		
		SavingsAccount.annualInterestRate = 0.04;
		
		// monthly interest for saver1
		System.out.println("Saver1's monthly interest and balance");
		for (int i = 0; i < 12; i++) {
			System.out.printf("Month %-3d: %10f\t%-10f\n", i+1, saver1.calculateMonthlyInterest(), saver1.getSavingsBalance());
		}
		System.out.println();
		
		// monthly interest for saver2
		System.out.println("Saver2's monthly interest and balance");
		for (int i = 0; i < 12; i++) {
			System.out.printf("Month %-3d: %10f\t%-10f\n", i+1, saver2.calculateMonthlyInterest(), saver2.getSavingsBalance());
		}
		System.out.println();
		
		SavingsAccount.annualInterestRate = 0.05;
		System.out.printf("Saver1 next month: %10f\t%-10f\n", saver1.calculateMonthlyInterest(), saver1.getSavingsBalance());
		System.out.printf("Saver2 next month: %10f\t%-10f\n", saver2.calculateMonthlyInterest(), saver2.getSavingsBalance());
	}
}

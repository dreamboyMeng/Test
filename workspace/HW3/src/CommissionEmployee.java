
public class CommissionEmployee extends Employee{
	private double grossSales;
	private double commissionRate;
	
	// constructor
	public CommissionEmployee(String firstName, String lastName,
			String socialSecurityNumber, double grossSales, 
			double commissionRate) {
		super(firstName, lastName, socialSecurityNumber);
		
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}
	
	@Override
	public double earnings() {
		return commissionRate * grossSales;
	}
	
	@Override
	public String toString() {
		return String.format("%s: %s%n%s: $%,.2f; %s: %.2f",
				"commission employee", super.toString(),
				"gross sales", grossSales,
				"commission rate", commissionRate);
	}
}

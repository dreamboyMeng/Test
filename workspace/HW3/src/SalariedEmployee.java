
public class SalariedEmployee extends Employee{
	private double weeklySalary;
	
	// constructor
	public SalariedEmployee(String firstName, String lastName, 
			String socialSecurityNumber, double weeklySalary) {
		super(firstName, lastName, socialSecurityNumber);
		
		if(weeklySalary < 0.0) 
			throw new IllegalArgumentException("Weekly salary must be >= 0.0");
		
		this.weeklySalary = weeklySalary;
	}
	
	@Override
	public double earnings() {
		return weeklySalary;
	}
	
	@Override
	public String toString() {
		return String.format("salaried employee: %s%n%s: $%,.2f",
				super.toString(), "weekly salary", weeklySalary);
	}
}


public class HourlyEmployee extends Employee {
	private double wage;
	private double hours;
	
	// constructor
	public HourlyEmployee(String firstName, String lastName, 
			String socialSecurityNumber, double wage, double hours) {
		super(firstName, lastName, socialSecurityNumber);
		
		if (wage < 0.0) // validate wage
			throw new IllegalArgumentException("Hourly wage must be >= 0.0");
		
		if (hours < 0.0 || hours > 168.0) // validate hours
			throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");
		
		this.wage = wage;
		this.hours = hours;
	}
	
	@Override
	public double earnings() {
		if (hours <= 40) 
			return wage * hours;
		else 
			return 40 * wage + (hours - 40) * wage * 1.5;
	}
	
	@Override
	public String toString() {
		return String.format("hourly employee: %s%n%s: $%,.2f; %s: %,.2f", 
				super.toString(), "hourly wage", wage, "hours worked", hours);
	}
}


public class Q4 {
	public static void main (String[] args) {
		
		SalariedEmployee salariedEmployee = new SalariedEmployee("Henry", "Zhang", "149738", 400);
		HourlyEmployee hourlyEmployee = new HourlyEmployee("Amy", "Wang", "234132", 20, 30);
		CommissionEmployee commissionEmployee = new CommissionEmployee("Brian", "Davis", "894323", 50, 30);
		BasePlusCommissionEmployee basePlusCommissionEmployee = 
				new BasePlusCommissionEmployee("Carlos", "Elster", "789234", 60, 25, 1000);
		PieceWorker pieceWorker = new PieceWorker("John", "Sampang", "703948", 50, 40);
		
		Employee[] employees = new Employee[5];
		employees[0] = salariedEmployee;
		employees[1] = hourlyEmployee;
		employees[2] = commissionEmployee;
		employees[3] = basePlusCommissionEmployee;
		employees[4] = pieceWorker;
		
		for (Employee currentEmployee : employees) {
			System.out.println(currentEmployee);
			
			if (currentEmployee instanceof BasePlusCommissionEmployee) {
				BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
				employee.setBaseSalary(1.10 * employee.getBaseSalary());
				System.out.printf("new base salary with 10%% increase is: $%,.2f%n", 
						employee.getBaseSalary());
			}
			
			System.out.printf("earned $%,.2f%n%n", currentEmployee.earnings());
		}
	}
}

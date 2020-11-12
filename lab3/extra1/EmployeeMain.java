class EmployeeMain
{
	public static void main(String args[])
	{
		System.out.println("Enter the Details of the Employee: ");
		
		Employee e = new Employee();
		
		e.getDetails();
		
		System.out.println("\nEmployee's Gross Salary : " + e.gross());
		
		System.out.println("Employee's Total Working Hours: " + e.empnohrs);
		
		System.out.println("Employee's Total Salary: " + (e.gross() + e.checkTime()));
	}
}

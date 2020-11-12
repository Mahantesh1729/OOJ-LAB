import java.util.Scanner;
class Employee
{
	String empid;
	String empname;
	double empnohrs;
	double empbasic;
	double emphra;
	double empda;
	double empit;
	double empgross;
	
	void getDetails()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Name : ");
		empname = input.next();
		System.out.print("ID : ");
		empid = input.next();
		System.out.print("No. of hrs : ");
		empnohrs = input.nextDouble();
		System.out.print("Basic Salary : ");
		empbasic = input.nextDouble();
		System.out.print("HRA : ");
		emphra = input.nextDouble();
		System.out.print("DA: ");
		empda = input.nextDouble();
		System.out.print("IT: ");
		empit = input.nextDouble();
	}
	
	double gross()
	{
		empgross= empbasic + empbasic*(emphra*0.01) + empbasic*(empda*0.01) - empbasic*(empit*0.01);
		return empgross;
	}
	
	double checkTime()
	{
		if(empnohrs > 200)
		{
			return empnohrs * 100;
		}
		else if(empnohrs < 200)
		{
			return -empnohrs * 100;
		}
		else
		{
			return 0;
		}
	}
	
	
}

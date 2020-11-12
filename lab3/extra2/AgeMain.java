import java.util.Scanner;
class AgeMain
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		Age m1 = new Age();
		Age m2 = new Age();
		System.out.print("Enter the name of person1: ");
		m1.name = input.next();
		System.out.print("Enter the name of person2: ");
		m2.name = input.next();
		System.out.println("Enter your age in format years months");
		System.out.print("Enter the Age of person1: ");
		m1.years = input.nextInt();
		m1.months = input.nextInt();
		System.out.print("Enter the Age of person2: ");
		m2.years = input.nextInt();
		m2.months = input.nextInt();
		System.out.println("Eldest of two people is " + m1.compare(m2));	
	}
}

import see.*;
import cie.*;
import java.util.Scanner;

class FinalMarks
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int n;
		String usn;
		String name;
		int sem;
		double cie_marks[] = new double[5];
		double see_marks[] = new double[5];
		System.out.print("Enter the no. of students: ");
		n = input.nextInt();
		Internals cie[] = new Internals[n];
		External see[] = new External[n];
		
		for(int i = 0; i < n; i++)
		{
			System.out.println("Enter the details of student " + (i + 1));
			System.out.print("NAME: ");
			name = input.next();
			System.out.print("USN: ");
			usn = input.next();
			System.out.print("SEM: ");
			sem = input.nextInt();
			System.out.println("Enter the cie marks of all subjects: ");
			for(int j = 0; j < 5; j++)
			{
				System.out.print("Subject "+ (j + 1) + " :");
				cie_marks[j] = input.nextInt();
			}
			System.out.println("Enter the see marks of all subjects: ");
			for(int j = 0; j < 5; j++)
			{
				System.out.print("Subject "+ (j + 1) + " :");
				see_marks[j] = input.nextInt();
			}
			
			cie[i] = new Internals(cie_marks, usn, name, sem);
			see[i] = new External(see_marks);
		}
		
		System.out.println("Student Details: ");
		
		for(int i = 0; i < n; i++)
		{
			System.out.println("Student "+ (i + 1) + " :");
			
			for(int j = 0; j < 5; j++)
			{
				System.out.println("Subject "+ (j + 1) +" : \nCIE: "+ cie[i].cie_marks[j] +"\nSEE: "+ see[i].see_marks[j]);
			}
		}
	}
}

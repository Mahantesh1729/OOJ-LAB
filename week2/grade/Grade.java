import java.util.*;
import java.lang.Math;

class Grade
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int cie,see;
		System.out.print("Enter your CIE marks: ");
		cie = input.nextInt();
		System.out.print("Enter your SEE marks: ");
		see = input.nextInt();
		
		see = Math.round((float) see / 2);
		
		int total = cie + see;
		
		if(total >= 90)
		{
			System.out.println("You've got S grade");
		}
		else if(total >= 80 && total < 90)
		{
			System.out.println("You've got A grade");
		}
		else if(total >= 70 && total < 80)
		{
			System.out.println("You've got B grade");
		}
		else if(total >=60 && total < 70)
		{
			System.out.println("You've got C grade");
		}
		else if(total >= 50 && total < 60)
		{
			System.out.println("You've got D grade");
		}
		else if(total >=40 && total < 50)
		{
			System.out.println("You've got E grade");
		}
		else
		{
			System.out.println("You've got F grade");
		}
	}
}

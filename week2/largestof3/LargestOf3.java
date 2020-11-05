import java.util.Scanner;

class LargestOf3
{
		public static void main(String args[])
		{
			Scanner input = new Scanner(System.in);
		
			System.out.println("Enter any three distinct numbers");
		
			double a = input.nextDouble();
			double b = input.nextDouble();
			double c = input.nextDouble();
			
			if(a >= b && a >= c)
			{
				System.out.println(a +" is largest");
			}
			else if(b >= c && b >= a)
			{
				System.out.println(b +" is largest");
			}
			else
			{
				System.out.println(c +" is largest");
			}
	}
}

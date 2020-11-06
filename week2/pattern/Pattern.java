import java.util.*;

class Pattern
{
	public static void main(String args[])
	{
		System.out.print("Enter any number: ");
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int count = 1;
		
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j <= i; j++)
			{
				System.out.print(count +"  ");
				count++;
			}
			System.out.println();
		}
	}
}

import java.util.*;

class PositiveNegativeZero
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the size of the array: ");
		
		int n;
		
		n = input.nextInt();
		
		System.out.println("Enter the Elments of the array");
		
		int a[] = new int[n];
		
		for(int i = 0; i < n; i++)
		a[i] = input.nextInt();
		
		int positive_count = 0, negative_count = 0, zero_count = 0;
		
		for(int i = 0; i < n; i++)
		{
			if(a[i] == 0)
			zero_count++;
			else if(a[i] > 0)
			positive_count++;
			else
			negative_count++;
		}
		
		System.out.println("Total +ve numbers = " + positive_count);
		System.out.println("Total -ve numbers = " + negative_count);
		System.out.println("Total Zeros = " + zero_count);
	}
}

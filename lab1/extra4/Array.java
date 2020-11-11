import java.util.*;
import java.lang.*;
class Array
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the size of the array");
		
		int n = input.nextInt();
		
		System.out.println("Enter the Elments of the array");
		
		int a[] = new int[n];
		for(int i = 0; i < n; i++)
		a[i] = input.nextInt();
		
		int b[], c[];
		if(n % 2 == 0)
		{
			b = new int[(int)(n / 2)];
			c = new int[(int)(n / 2)];
		}
		else
		{
			b = new int[(int)((n + 1) / 2)];
			c = new int[(int)((n - 1) / 2)];
		}
		int c_count = 0, b_count = 0;
		for(int i = 0; i < n; i++)
		{
			if(a[i] % 2 == 0)
			{
				c[c_count] = a[i];
				c_count++;
			}
			else
			{
				b[b_count] = a[i];
				b_count++;
			}
		}
		double sum = 0;
		double max = -11111, min = 99999;
		for(int i = 0; i < c.length; i++)
		{
			sum += c[i];
			if(c[i] >= max)
			{
				max = c[i];
			}
			if(c[i] <= min)
			{
				min = c[i];
			}
		}
		
		System.out.println("Sum of elements in C = " + sum);
		System.out.println("Average of elements in C = " + sum / c.length);
		System.out.println("Max of C = " + max);
		System.out.println("Min of C = " + min);
	}
}

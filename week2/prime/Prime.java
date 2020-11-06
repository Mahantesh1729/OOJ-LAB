import java.util.*;

class Prime
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter any two integers between which you want to find prime numbers");
		
		int a, b;
		
		a = input.nextInt();
		b = input.nextInt();
		int i, flag = 1;
		System.out.println("List of prime numbers between "+ a + " and " + b + " are:");
		for(i = a; i <= b; i++)
		{
			for(int j = 2; j < i; j++)
			{
				if(i % j == 0)
				{
					flag = 0;
					break;
				}
				flag = 1;
			}
			if(flag == 1 && i != 1)
			{
				System.out.println(i);
			}
		}
	}
	
}

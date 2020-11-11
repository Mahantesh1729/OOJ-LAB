import java.util.*;

class Bill
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of types of items purchased");
		
		int n = input.nextInt();
		
		double cost[] = new double[n];
		
		System.out.println("Enter the cost and quantity purchased of each item");
		System.out.println();
		int quantity[] = new int[n]; 
		double total = 0;
		
		for(int i = 0; i < n; i++)
		{
			System.out.print("Enter the cost and quantity purchased of item"+ (i + 1) +":");
			cost[i] = input.nextDouble();
			quantity[i] = input.nextInt(); 
			total += cost[i] * quantity[i];
		}
		
		System.out.println("Total Bill = " + total);
		
		if(total >= 10000)
		{
			total = total - total * 0.05;
			System.out.println("5% Discount:");
			System.out.println("Final Bill = " + total);  
		}
		else if(total >= 7500)
		{
			total = total - total * 0.03;
			System.out.println("3% Discount:");
			System.out.println("Final Bill = " + total);  
		}
		else if(total >= 5000)
		{
			total = total - total * 0.02;
			System.out.println("2% Discount:");
			System.out.println("Final Bill = " + total);  
		}
		else 
		{
			System.out.println("0% Discount:");
			System.out.println("Final Bill = " + total);  
		}
	}
}

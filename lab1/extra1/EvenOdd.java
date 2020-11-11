import java.util.*;
class EvenOdd
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the size of the array: ");
		
		int n = input.nextInt();
		
		int num[] = new int[n];
		
		System.out.println("Enter the elements of the arrya");
		
		for(int i = 0; i < n; i++)
		num[i] = input.nextInt();
		
		int evensum = 0, oddsum = 0;
		
		for(int i = 0; i < n; i += 2)
		evensum += num[i];
		
		for(int i = 1; i < n; i += 2)
		oddsum += num[i];
		
		System.out.println("Even Sum: " + evensum);
		System.out.println("Odd Sum: " + oddsum);
	}
}

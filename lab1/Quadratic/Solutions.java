import java.util.*;
import java.lang.Math;
class Solutions
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		float a, b, c;
		System.out.println("Enter the three coefficients of your quadratic equation");
		a = input.nextFloat();
		b = input.nextFloat();
		c = input.nextFloat();
		
		float d, sol1, sol2;
		
		d = b * b - 4 * a * c;
		
		if ( d < 0)
		{
			System.out.println("No Real Solutions");
		}
		else
		{
			sol1 = (float)(-b + Math.sqrt(d)) / (2 * a);
			sol2 = (float)(-b - Math.sqrt(d)) / (2 * a);
			
			System.out.println("Solution1 : " + sol1);
			System.out.println("Solution2 : " + sol2);
					
		}
	}
}

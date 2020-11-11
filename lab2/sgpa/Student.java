import java.util.*;
class Student
{
		public static String usn;
		public static String name;
		public static int credits[];
		public static int marks[];
		public static void main(String args[])
		{
			System.out.println("Enter your Details: ");
			System.out.println();
			getdetails();
			System.out.println(name + " got " + calculatesgpa() +" sgpa");
		}
		public static void getdetails()
		{
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter your USN: ");
			
			usn = input.next();
			System.out.println();
			System.out.print("Enter your name: ");
			
			name = input.next();
			System.out.println();
			credits = new int[5];
			marks = new int [5];
			for(int i = 0; i < 5; i++)
			{
				System.out.print("Enter your marks in Subject " + (i+1) + " :");
				
				marks[i] = input.nextInt();
				System.out.println();
				System.out.print("Enter the credits of Subject " + (i+1) + " :");
				
				credits[i] = input.nextInt();
				System.out.println();
			}
		}
		public static double calculatesgpa()
		{
			int c;
			int sum = 0;
			int sum_credits = 0;
			for(int i = 0; i < 5; i++)
			{
				c = subjectpoints(marks[i]);
				sum_credits += credits[i];
				sum += c * credits[i];
			}
			
			return (double)sum / sum_credits;
		}
		public static int subjectpoints(int marks)
			{
				if(marks>=90&&marks<=100)
        		{
            		return 10;
        		}
        		else if(marks>=80&&marks<90)
        		{
            		return 9;
        		}
        		else if(marks>=70&&marks<80)
        		{
            		return 8;
        		}
        		else if(marks>=60&&marks<70)
        		{
            		return 7;
        		}
        		else if(marks>=50&&marks<60)
        		{
            		return 6;
        		}
        		else if(marks>=40&&marks<50)
        		{
            		return 5;

        		}
       		 	else
        		{
            		System.out.println("You Have Failed In This Subject");
            		return 0;
        		}
		}
}

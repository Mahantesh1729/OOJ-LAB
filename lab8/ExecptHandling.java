import java.util.*;
class wrg extends Exception
{
	int f, s;
	wrg(int fa, int sa)
	{
		f = fa;
		s = sa;
	}
	public String toStirng()
	{
		return "Father's age ("+f+") can't be <= to son's age ("+s+")....."; 
	}
} 

class neg extends Exception
{
	int a;
	neg(int fa)
	{
		a = fa;
	}
	public String toString()
	{
		return "Age ("+a+")can't be negative";
	}
}

class Father
{
	int age;
	String name;
	Scanner in = new Scanner(System.in);
	Father () throws neg
	{
		System.out.println("Enter father's name: ");
		name = in.next();
		System.out.print("Enter father's age: ");
		age = in.nextInt();
		if(age < 0)
		{
			throw new neg(age);
		}
	}
}

class Son extends Father
{
	int sage;
	String sname;
	Scanner in = new Scanner(System.in);
	
	Son() throws neg, wrg
	{
		super();
		System.out.print("Enter son's name: ");
		sname = in.next();
		System.out.print("Enter son's age: ");
		sage = in.nextInt();
		if(sage < 0)
		{
			throw new neg(sage);
		}
		if(sage >= age)
		{
			throw new wrg(age, sage);
		}
		System.out.println("Father's age is "+ age +" and Son's age is " + sage);
	} 

}
class ExecptHandling
{
	public static void main(String args[])
	{
		try
		{
			Son s = new Son();
		}
		catch(neg n)
		{
			System.out.println("Exception caught: "+n);
		}
		catch(wrg w)
		{
			System.out.println("Exception caught: " +w);
		}
	}
}

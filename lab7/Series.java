import java.io.*;
import java.lang.*;
import java.util.*;
class gen<T>
{
	T ob;
	gen(T o)
	{
		ob=o;
	}
	T getob()
	{
		return ob;
	}
	void showtype()
	{
		System.out.println("Type of T is " + ob.getClass().getName());
	}
}

class Series
{
	public static void main(String[] args)
	{
		String n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Integer Number to Be Displayed Using the generic style");
		n=sc.next();
		gen<Integer> ob1=new gen<Integer>(Integer.parseInt(n));
		ob1.showtype();
		int val=ob1.getob();
		System.out.println("Value is: " + val);
		System.out.println();
		System.out.println("Enter the String to Be Displayed Using the generic style");
		n=sc.next();
		gen<String> ob2=new gen<String>(n);
		ob2.showtype();
		String x=ob2.getob();
		System.out.println("Value : " + x);
		System.out.println();
		System.out.println("Enter the Double Number to Be Displayed Using the generic style");
		n=sc.next();
		gen<Double> ob3=new gen<Double>(Double.parseDouble(n));
		ob3.showtype();
		double ans=ob3.getob();
		System.out.println("Value : " + ans);
	}
}

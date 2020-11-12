import java.io.*;
import java.lang.*;
import java.util.*;
abstract class account
{
	String name;
	String acc_no;
	String type;
	double balance;

	account(String n,String a,String t,double b)
	{
		name=n;
		acc_no=a;
		type=t;
		balance=b;
	}
	abstract void deposit();
	abstract void display();
	abstract void withdraw();
	abstract void fine();
	abstract void inter();
}

class curr_acc extends account
{
	curr_acc(String n,String a,String t,double b)
	{
		super(n,a,t,b);
	}
	
    void fine()
    {
	   if(balance<1000)
	   {
		   System.out.println("You Will Be Fined 500Rs Because Minimum balance In Your Account Must be 1000 ");
		   balance=balance-500;
		   display();
	   }
	   else
	   {
	   	 System.out.println("You Will Not Be Charged Any Fine Thank You ");
	   	 display();
	   }
	}


	void display()
	{
		System.out.println("Name Of the Account Holder is  " + name);
		System.out.println("Account Number of the Account Holder is " + acc_no);
		System.out.println("Type Of the Account od the Account Holder is " + type);
		System.out.println("Balance In Your Account is " + balance);
	}

	void deposit()
	{
		double sum;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Amount You Want To Deposit ");
		sum=sc.nextDouble();
		balance=balance+sum;
		display();
	}
	void withdraw()
	{
		double sum;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount You Want To Withdraw ");
		sum=sc.nextDouble();
		balance=balance-sum;
		if(balance>1000)
		{
			display();
		}
		else
		{
			System.out.println("You Cannot Withdraw This Much Amount ");
			fine();
		}
	}

	void inter()
	{
		System.out.println("Your Account Type Is Not Elgible For Any Interest ");

	}
}

class sav_acc extends account
{
	sav_acc(String n,String a,String t,double b)
	{
		super(n,a,t,b);
	}
	void display()
	{
		System.out.println("Name Of the Account Holder is  " + name);
		System.out.println();
		System.out.println("Account Number of the Account Holder is " + acc_no);
		System.out.println();
		System.out.println("Type Of the Account of the Account Holder is " + type);
		System.out.println();
		System.out.println("Balance In Your Account is " + balance);
		System.out.println();
	}
	void withdraw()
	{
		double sum;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount You Want To Withdraw ");
		System.out.println();
		sum=sc.nextDouble();
		balance=balance-sum;
		display();
	}

	void deposit()
	{
		int sum;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the principal amount you want to submit ");
		sum=sc.nextInt();
		balance+=sum;
		display();

	}

	void inter()
	{

        double r,t;
        double interest;
        double amount;
        double power;
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Rate of interest ");
		r=sc.nextDouble();
		System.out.println("Enter the Year of time Account has to be elapsed ");
		t=sc.nextDouble();

		power=Math.pow((1+((r)/(100))),t);
		System.out.println(power);
		amount=balance*power;
		System.out.println(amount);
		interest=amount-balance;
		System.out.println("Interest Accumalted In Your Account is " + interest);
		display();
		System.out.println();
	}

	void fine()
	{
		System.out.println("You Have No Restriction On Your Minimum Balance Thank You! ");
		System.out.println();
	}

}

class Bank
{
	 
	public static void main(String[] args)
	{
		account a;
		Scanner sc=new Scanner(System.in);	
		String name,acc_num,typ;
		int option;
		double bal;
		System.out.println("Enter the name of the account holder ");
		name=sc.next();
		System.out.println("Enter the Account Number ");
		acc_num=sc.next();
		typ="Current Account";
		System.out.println("Enter the Minimum Balance in the account ");
		bal=sc.nextDouble();
		System.out.println();
		System.out.println("1: Current Account ");
		System.out.println("2: Savings Account ");
		System.out.println("3: Exit");
		System.out.println();
		System.out.println("Enter your choice ");
		option=sc.nextInt();
		
		switch(option)
		{
			case 1:
			curr_acc c=new curr_acc(name,acc_num,typ,bal);
			a=c;
			int counter;
			do
			{
				 System.out.println("1: Check For Fine ");
				 System.out.println("2: Deposit ");
				 System.out.println("3: Withdraw ");
				 System.out.println("4: Exit");
				 System.out.println();
				 System.out.println("Enter Your Choice ");
				 counter=sc.nextInt();
				 switch(counter)
				 {
				   	 case 1:
				   	 a.fine();
				   	 break;

				   	 case 2:
				   	 a.deposit();
				   	 break;

				   	 case 3:
				   	 a.withdraw();
				   	 break;

				   	 case 4:
				   	 System.exit(0);
				   	 break;

				  }
			  }while(counter!=4);

			  break;


			case 2:
			sav_acc s=new sav_acc(name,acc_num,typ,bal);
			a=s;
			int cnr;
		    do
		     {
				   	       		   	       
				System.out.println("1: Deposit ");
				System.out.println("2: Withdraw ");
				System.out.println("3: Interest");
				System.out.println("4: Exit");
				System.out.println();
				System.out.println("Enter Your Choice ");
				cnr=sc.nextInt();	
				switch(cnr)
				{
				   	    case 1:
				   	    a.deposit();
				   	    break;

				   	    case 2:
				   	    a.withdraw();
				   	    break;

				   	    case 3:
				   	    a.inter();

				   	    case 4:
				   	    System.exit(0);
				   	    break;

				}
			  }while(cnr!=5);
				break;   


				case 3:
				System.exit(0);
				break; 
	    }
	}
}

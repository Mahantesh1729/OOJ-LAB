class Table
{
	int n;
	
    synchronized void printable(int n)
	{
		for(int i = 1;i <= 10; i++)
		{
			System.out.println(n + " x " + i +" = " +(n * i));
			  try
			  {  
				  Thread.sleep(400);  
		 	  }
		 	  catch(Exception e)
		 	  {
		 	  	System.out.println(e);
		 	  }
		} 	    
	
	}
}
class Five extends Thread
{
	Table n;
	
	Five(Table n)
	{
		this.n = n;					
	}
	
	public void run()
	{	
		n.printable(5);
	}
}
class Hundred extends Thread
{
	Table n;
		
	Hundred(Table n)
	{
		this.n = n;
	}
	
	public void run()
	{
		n.printable(100);
	}
}
class MultiplicationTable
{
	public static void main(String args[])
	{
		Table n = new Table() ;
		Five f = new Five(n);
		Hundred h = new Hundred(n);
		f.start();
		h.start();		
	}
}

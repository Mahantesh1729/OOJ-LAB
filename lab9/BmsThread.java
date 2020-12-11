class BmsThread
{
	public static void main(String[] args)
	{
		Thread1 a = new Thread1("BMS COLLEGE OF ENGINEERING");
		Thread2 b = new Thread2("CSE");
		try
		{
			a.t.join();
			b.t.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("Main thread Interuppted");
		}
	}
}

class Thread1 implements Runnable
{
	String name;
	Thread t;
	Thread1(String threadname)
	{
		name = threadname;
		t = new Thread(this, name);
		t.start();
	}
	
	public void run()
	{
		try
		{
			while(true)
			{
				System.out.println(name);
				Thread.sleep(10000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Interuupted in BMS");
		}
	}
}
class Thread2 implements Runnable
{
	String name;
	Thread t;
	Thread2(String threadname)
	{
		name = threadname;
		t = new Thread(this, name);
		t.start();
	}
	public void run()
	{
		try
		{
			while(true)
			{
				System.out.println(name);
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Interuupted in CSE");
		}
	}
}

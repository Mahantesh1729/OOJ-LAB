package cie;

public class Internals extends Student
{
	public double cie_marks[] = new double[5];
	
	public Internals(double cie[], String u, String n, int s)
	{
		super(u, n, s);
		for(int i = 0; i < 5; i++)
		cie_marks[i] = cie[i];
	}
}

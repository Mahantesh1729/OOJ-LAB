package see;
public class External extends cie.Student
{
	public double see_marks[] = new double[5];
	
	public External(double see[])
	{
		super();
		for(int i = 0; i < 5; i++)
			see_marks[i] = see[i];
	}
}

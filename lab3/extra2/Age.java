class Age
{
	int years;
	int months;
	String name;
	
	String compare(Age m)
	{
		if((years * 12 + months) > (m.years * 12 + m.months))
		return name;
		else
		return m.name;
	}
}

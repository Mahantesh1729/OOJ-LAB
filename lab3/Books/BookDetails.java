import java.util.*;

class Book
{
	String name;
	String author;
	double price;
	int num_pages;
	
	Book(String name, String author, double price, int num_pages)
	{
		this.name = name;
		this.author = author;
		this.price = price;
		this.num_pages = num_pages;		
	}
	public String toString()
	{
		return ("\nAuthor: "+ author +"\nPrice: "+ price +"\n Total pages: "+num_pages);
	}
}

class BooksDetails
{
	public static void main(String args[])
	{
		String a;
		String b;
		double c;
		int d;
		System.out.print("How many books details do you want to enter:");
		int n;
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		Book book[] = new Book[n];
		for(int i = 0; i < n; i++)
		{
			System.out.println("Enter the details of Book "+ (i + 1) +" :");
			System.out.print("Name: ");
			a = input.nextLine();
			input.nextLine();
			System.out.print("Author: ");
			b = input.nextLine();
			System.out.print("Price: ");
			c = input.nextInt();
			System.out.print("Total Pages: ");
			d = input.nextInt();
			book[i] = new Book(a, b, c, d);
		}
		
		for(int i = 0; i < n; i++)
		{
			System.out.println("Details of Book " + book[i].name +" : ");
			System.out.println(book[i]);	
		}
	}
}












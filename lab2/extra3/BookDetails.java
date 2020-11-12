import java.util.*;

class Book
{
	String bookid;
	String booktitle;
	int no_of_pages;
	int year_of_pub;
	String author;
	String publisher;
	double price;
	void details()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Book ID: ");
		bookid = input.nextLine();
		input.nextLine();
		System.out.print("\nBook Title: ");
		booktitle = input.nextLine();
		input.nextLine();
		System.out.print("\nTota Pages: ");
		no_of_pages = input.nextInt();
		System.out.print("\nYear of Publication: ");
		year_of_pub = input.nextInt();
		input.nextLine();
		System.out.print("\nPublisher: ");
		publisher = input.nextLine();
		System.out.print("\nAuthor: ");
		author = input.nextLine();
		input.nextLine();
		System.out.print("\nPrice: ");
		price = input.nextDouble();
	}
	void display()
	{
		System.out.print("Book ID: "+ bookid);
		System.out.print("\nBook Title: " + booktitle);
		System.out.print("\nTota Pages: "+ no_of_pages);
		System.out.print("\nYear of Publication: "+ year_of_pub);
		System.out.print("\nAuthor: "+ author);	
		System.out.print("\nPublisher: "+ publisher);
		System.out.print("\nPrice: "+ price);
	}
}

class BookDetails
{
	public static void main(String args[])
	{
		Book b[];
		b = new Book[3];
		b[0] = new Book();
		b[1] = new Book();
		b[2] = new Book();
		
		System.out.println("\nEnter the book details\n");	
		for(int i = 0; i < 3; i++)
		{
			System.out.println("\nEnter the details of book" +(i + 1)+"\n");
			b[i].details();
		}
		System.out.println("\nDisplaying the book Details\n");
		
		for(int i = 0; i < 3; i++)
		{
			System.out.println("\n\nBook" +(i + 1)+" Details:\n");
			b[i].display();
		}
		
		String author = new String();
		
		System.out.print("\nEnter the author that you want to search: ");		
		Scanner input = new Scanner(System.in);
		
		author = input.nextLine();
		
		for(int i = 0; i < 3; i++)
		{
			if(author.equals(b[i].author))
			b[i].display();
		}			
		
		if(b[0].price > b[1].price && b[0].price > b[2].price)
		{
			System.out.println("\n"+ b[0].booktitle +" is the most expensive book\n");
		}
		else if(b[1].price > b[2].price)
		{
			System.out.println("\n"+ b[1].booktitle +" is the most expensive book\n");
		}
		else
		{
			System.out.println("\n"+ b[2].booktitle +" is the most expensive book\n");
		}
		int c = 0;
		for(int i = 0; i < 3; i++)
		{
			if(b[i].year_of_pub == 2020)
			c++;
		}		
		System.out.println("\nTotal no. of books published in 2020 is "+c);
		
		System.out.println("\nBook with least no. of pages: ");
		
		if(b[0].no_of_pages < b[1].no_of_pages && b[0].no_of_pages < b[2].no_of_pages)
		{
			b[0].display();
		}
		else if(b[1].price < b[2].price)
		{
			b[1].display();
		}
		else
		{
			b[2].display();
		}	
		System.out.println();
	}
}

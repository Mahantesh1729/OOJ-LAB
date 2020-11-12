import java.util.*;

class Player
{
	String ID;
	String name;
	int scores[] = new int[5];
	int matches_played;
	double average;
	Player(String a, String b, int scores[], int matches_played)
	{
		name = a;
		ID = b;
		for(int i = 0; i < 5; i++)
		this.scores[i] = scores[i];
		this.matches_played = matches_played;
	}
	double average()
	{
		double sum = 0;
		
		for(int i = 0; i < 5; i++)
		{
			sum += scores[i];
		}
		average = sum / 5;
		
		return average;
	}
	void display()
	{
		System.out.println("Name: " + name);
		System.out.println("ID: " + ID);
		System.out.println("Matches played: " + matches_played);
		System.out.print("Recent Form:");
		for(int i = 0; i < 5; i++)
		System.out.print(" " + scores[i]);
		System.out.println("\nAverage of last 5 matches: " + average);
	}
}
class PlayerCareer
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		String name;
		String id;
		int scores[] = new int[5];
		int matches_played;
		
		System.out.println("Enter the details of player 1: \n");
		System.out.print("Enter the name of player 1: ");
		name = input.nextLine();
		System.out.println();
		System.out.print("Enter the player1 ID: ");
		id = input.nextLine();
		System.out.println("\nEnter the scores of player1 in last 5 matches:");
		for(int i = 0; i < 5; i++)
		scores[i] = input.nextInt();
		System.out.print("\nEnter the total matches played: ");
		matches_played = input.nextInt();
		Player p1 = new Player(name, id, scores, matches_played);
		
		System.out.println("Enter the details of player 2: \n");
		System.out.print("Enter the name of player 2: ");
		input.nextLine();
		name = input.nextLine();
		System.out.println();
		System.out.print("Enter the player2 ID: ");
		id = input.nextLine();
		System.out.println("\nEnter the scores of player2 in last 5 matches:");
		for(int i = 0; i < 5; i++)
		scores[i] = input.nextInt();
		System.out.print("\nEnter the total matches played: ");
		matches_played = input.nextInt();
		Player p2 = new Player(name, id, scores, matches_played);
		
		if(p1.average() > p2.average())
		{
			p1.display();
		}
		else
		{
			p2.display();
		}
	
	
	
	
	
	
	
	}	
		
	
	
	
	
	
	
	
}

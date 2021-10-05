/* Klassen player ska innehålla privata instansvariabler av lämpliga typer om spelarens namn
och information om antalet spelade och vunna matcher
 */
import java.util.Scanner;
public class Player
{
	private String name;
	private int numberOfGames;
	private int matchesWon;
	
	//Obligatorisk metod
	public Player()
	{
		//name
		//numberOfGames
		//matchesWon
	}
	public void Scanner()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Ange spelarens namn");
		this.name = sc.nextLine();
	}
	
	public String getName(){
		return this.name;
	}
}

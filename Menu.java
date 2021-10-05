/* : Varje meny i spelet ska vara en instans av klassen Menu. Utöver lämplig konstruktor och
instansvariabler ska metoden show() skriva ut menyn. Instansmetoderna getString(), getAlpha() och
getInt() väntar till spelaren skrivit in en sträng, en bokstav respektive ett nummer. Skriver spelaren
fel typ av input ska lämpligt felmeddelande skrivas ut. */
import java.util.Scanner;
import java.util.Arrays;
public class Menu
{
	String[] playerNames = new String[1000];
	int currentSize;
	
	//Obligatorisk metod
	public Menu()
	{
		this.currentSize = 0;
	}
	
	public void startMeny()
	{
		
		//creates a double for the while loop
		boolean switchCaseIsActive = true;
		//
		while (switchCaseIsActive)
		{
			System.out.println("Välj ett av alternativen!");
			printMeny();
			//creates a new scanner
			Scanner scanner = new Scanner(System.in);
			//int input = 0;
			System.out.print("");
			String input = scanner.nextLine();
			
			
			switch (input)
			{
				case "1":
					System.out.println("Spela spelet");
					System.out.println(" ");
					break;
				case "2":
					System.out.println("Lägg till spelare");
					Player newPlayer = new Player();
					newPlayer.Scanner();
					fillingArray(newPlayer);
					//Skriv ut vem som lagts till?
					//metoden för att finna ut om spelaren redan finns
					break;
				case "3":
					System.out.println("Välj spelare: ");
					//String name = getString();
					this.printCurrentPlayer(this.playerNames);
					
					break;
				case "5":
					System.out.println("Avsluta");
					switchCaseIsActive = false;
					break;
				default:
					System.out.println("Felaktig input! Välj ett av alternativen i menyn");
					break;
			}
		}
	}
			//fills the array that saves all player names
			public void fillingArray(Player newPlayer)
			{
				for (int i = 0; i < this.playerNames.length; i++)
				{
					if(playerNames[i] == null){
						playerNames[i] = newPlayer.getName();
						this.currentSize++;
						break;
					}
				}
			}
			//prints out all player names from the array
			public void printCurrentPlayer(String[] nameArray)
			{
				for(int i = 0; i<currentSize; i++){
					
					System.out.println(nameArray[i]);
				}
			}
			//This method prints out the menu after the choice has been made
			public static void printMeny ()
		{
			System.out.println("Tryck 1: Spela spelet");
			System.out.println("Tryck 2: Lägg till ny spelare");
			System.out.println("Tryck 3: Välj spelare");
			System.out.println("Tryck 4: Avsluta spelet");
		}
			//Obligatorisk metod
			public static void show ()
		{
		}
			//Obligatorisk metod
			//Pratar med klassen Game och är till för String name
			public static void getString()
		{
			String name[] = new String[1000];
			System.out.println("Skriv in spelarens namn: ");
			Scanner sc = new Scanner(System.in);
			for (int i = 0; i < name.length; i++)
			{
				name[i] = sc.next();
			}
		}
			//Obligatorisk metod
			//Pratar med klassen Game och är till för  asterixen char "*"
			public static void getAlpha()
		{
		
		}
			//Obligatorisk metod
			//Pratar med klassen Game och är till för int numberOfGames och int gamesWon
			public static void getInt()
		{
			//creates a new scanner
			Scanner scanner = new Scanner(System.in);
			//creates a variable that holds the input
			int gamesPlayed = 0;
			int gamesWon =0;
			while (true)
			{
				//tries to convert the input to an integer
				try
				{
					//System.out.print("Please insert your number here: ");
					//scannedVariable = Integer.parseInt(scanner.next());
					//if the input is an integer, input is saved in scannedVariable
					//if (scannedVariable > max)
					{
						//checks if the input is too high and returns an error
						System.out.println("Error, number is too high");
					}
					//else if (scannedVariable < min)
					{
						//checks if the input is too low and returns an error
						System.out.println("Error, number is too small");
					}
					//else
					{
						//breaks the while loop because of a valid input
						break;
					}
					//If the input can not be converted into an integer
				} catch (NumberFormatException exception)
				{
					//throws an error if the input is not an integer
					System.out.println("Please enter a number.");
				}
			}
		}
			//Meny, Alternativ 1: Spela spelet
			//Meny, Alternativ 2: Lägg till ny spelare
			//Meny, Alternativ 3: Välj spelare
			//Meny, Alternativ 4: Avsluta
			
			/* Skriv in ditt anamn, om det inte finns ska ett felmeddelande säga "Spara spelare först, sen kan ni spela".
			 */
	
}

//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response;
		do {
			
			System.out.print("Rock-Paper-Scissors - pick your weapon[R,P,S] :: ");
			RockPaperScissors test = new RockPaperScissors(keyboard.next());
			System.out.println( test );
			System.out.println(test.determineWinner()+ "\n");
			
			System.out.print("Do you wanna play again?");
		}
		
		//add in a do while loop after you get the basics up and running
		
			String player = "";
		
			out.print("type in your prompt [R,P,S] :: ");
			
			//read in the player value
		
			RockPaperScissors game = new RockPaperScissors();		
	}
}




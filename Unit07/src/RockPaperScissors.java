//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		playChoice = "";
		compChoice = "";
	}

	public RockPaperScissors(String player)
	{
		int choice = (int)(Math.random()*3);
		switch(choice)
		{
		case 0 : compChoice = "R";break;
		case 1 : compChoice = "P";break;
		case 2 : compChoice = "S";break;
		}
		playChoice = player;
	}

	public void setPlayers(String player)
	{
		String winner = "";
		if (compChoice.equals(playChoice))
		{
			winner = "!Draw Game!";
		}
		else if (compChoice.equals("R"))
		{
			if (playChoice.equals("P"))
			{
				winner = "!Player wins <<Paper Covers Rock>>!";
			}
			else if (playChoice.equals("S"))
			{
				winner = "!Computer wins <<Rock Smashes Scissors>>!";
			}
		}
		else if (compChoice.equals("S"))
		{
			if (playChoice.equals("R"))
			{
				winner = "!Player wins <<Rock Smashes Scissors>>!";
			}
			else if (playChoice.equals("P"))
			{
				winner = "!Computer wins <<Scissors Cut Paper>>!";
			}
		}
		else if (compChoice.equals("P"))
		{
			if (playChoice.equals("R"))
			{
				winner = "!Computer wins <<Paper Covers Rock>>!";
			}
			else if (playChoice.equals("S"))
			{
				winner = "!Computer wins <<Scissors Cut Paper>>!";
			}
		}
		
	}

	public String determineWinner()
	{
		String winner="";
		return winner;
	}

	public String toString()
	{
		String output="";
		return output;
	}
}
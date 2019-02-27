`//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		letter = ' ';
		amount = 0;
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		//output string needed for return output
		String output="";
		//need this variable to change original variable
		char currentLetter = letter;
		//need this variable to keep original variable
		char originalLetter = letter;
		//need this to keep original amount
		int originalAmount = amount;
		//need this for changing amount
		int currentAmount = amount;
		//need this for total columns of chars in a row
		int colsInRow = amount;
		
	//outer for loop needed	to increment columns, while loop is needed to increment letters in rows	
		for (int i = 1; i <= originalAmount; i++) {	
		//need to change this while loop condition so it lessens each round
		while (colsInRow > 0) {
			for (int n = currentAmount; n>0; n--) 
			{
				output += currentLetter;
			}
			//add spaces between letters in rows, go to next letter, minus amount
			output += " ";
			if (currentLetter == 'z') currentLetter = 'a' - 1;
			if (currentLetter == 'Z') currentLetter = 'A' - 1;
			currentLetter += 1;
			currentAmount -= 1;
			//changing while condition so it can break out of loop
			colsInRow -= 1;
		}
		//add line breaks between rows and go back to original letter and original amount
		output += "\n";
		currentLetter = originalLetter;
		currentAmount = originalAmount;
		//reset while condition but to one less each loop, so that row chars lessen each time
		colsInRow = originalAmount - i;
	}
		return output;
		
}
	
}
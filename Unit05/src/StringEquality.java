//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringEquality
{
	private String wordOne, wordTwo;
	private int check;

	public StringEquality()
	{
		wordOne = "";
		wordTwo = "";
	}

	public StringEquality(String one, String two)
	{
		setWords(one, two);
	}

	public void setWords(String one, String two)
	{
		wordOne = one;
		wordTwo = two;
	}

	public boolean checkEquality( )
	{
		if (wordOne.equals(wordTwo))
			return true;
		else
			return false;
		
	}

	public String toString()
	{
		String output="";
 		if (checkEquality())
 		{
 			output = wordOne + " has the same letters as " + wordTwo + "\n";
 		}
 		else
 		{
 			output = wordOne + " does not have the same letters as " + wordTwo + "\n"; 
 		}

 		return output;
			
	}
}
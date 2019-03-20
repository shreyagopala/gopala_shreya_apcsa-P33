//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		word = s;
	}
	
	
	public int compareTo(Word rhs)
	{	
		int ret = 0;
		if (word.length() == rhs.word.length()) ret = word.compareTo(rhs.word);
		else if (word.length() > rhs.word.length()) ret = 1;
		else if (word.length() < rhs.word.length()) ret = -1;
		return ret;
	}

	public String toString()
	{
		return "";
	}
}
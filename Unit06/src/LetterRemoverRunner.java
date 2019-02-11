//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		LetterRemover test = new LetterRemover("I am Sam I am", 'a');
		out.println(test);
		
		test.setRemover("qwertyqwertyqwerty", 'a');
		out.println(test);
											
	}
}
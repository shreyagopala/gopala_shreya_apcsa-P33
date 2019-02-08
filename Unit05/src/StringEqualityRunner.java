//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
StringEquality test = new StringEquality();
		
		test.setWords("hello","goodbye");
		test.checkEquality();
		out.println( test );
		
		test.setWords("one","two");
		test.checkEquality();
		out.println( test );
		
		test.setWords("three","four");
		test.checkEquality();
		out.println( test );
		
		test.setWords("TCEA","UIL");
		test.checkEquality();
		out.println( test );
		
		test.setWords("State","Champions");
		test.checkEquality();
		out.println( test );
		
		test.setWords("ABC","ABC");
		test.checkEquality();
		out.println( test );
		
		test.setWords("ABC","CBA");
		test.checkEquality();
		out.println( test );
		
		test.setWords("Same","Same");
		test.checkEquality();
		out.println( test );
		
	}
}
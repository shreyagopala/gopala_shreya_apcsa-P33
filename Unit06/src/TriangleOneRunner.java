//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class TriangleOneRunner
{
	public static void main ( String[] args )
	{
		TriangleOne test = new TriangleOne();
		test.setWord("hippo");
		out.println(test);
		
		test.setWord("abcde");
		out.println(test);
		
		test.setWord("it");
		out.println(test);
		
		test.setWord("hippo");
		out.println(test);
	}
}
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
	public static void main( String args[] ) throws IOException
	{
		Grid test = new Grid(4,3, new String[] {"hi", "hello", "baby", "duck"});
		test.findMax(new String[] {"hi", "hello", "baby", "duck"});
		test.countVals("duck");
	}
}
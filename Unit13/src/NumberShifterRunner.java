//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifterRunner
{
	public static void main( String args[] ) throws IOException
	{
		NumberShifter test = new NumberShifter();
		for (int i = 0; i < 1; i++) {
			int[] array = NumberShifter.makeLucky7Array(20);
			out.println(Arrays.toString(array));
			NumberShifter.shiftEm(array);
			out.println(Arrays.toString(array));
	}
	}
}
}




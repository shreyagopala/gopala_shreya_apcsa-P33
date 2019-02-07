//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 
import java.util.Scanner;

public class AddSubMult
{
	public static double check( double a, double b )
	{
		double answer = 0;
		if (a > b) 
			answer = a - b;
		else if (b > a) 
			answer = b - a;
		else if (a == b) 
			answer = a * b;
		
		return answer;
	}
}
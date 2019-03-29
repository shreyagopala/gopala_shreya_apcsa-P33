//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class RecursionFunOne
{
	public static int countOddDigits(int num, int i)
	{
		if (num > 0) {
			if ((num % 10*i)%2 == 0) return 1 + countOddDigits(num, i++);
		}
		return 0 + countOddDigits(num,i++);
	}
}
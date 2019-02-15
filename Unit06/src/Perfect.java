//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;

	public Perfect() {
		setNumber(0);
	}
	public Perfect(int num) {
		setNumber(num);
	}
	public void setNumber(int num) {
		number = num;
	}
	public boolean isPerfect()
	{
		int sum = 0;
		for (int i = 1; i <= number/2; i++)
			if (number%i == 0) sum += i;
		if (sum == number) return true;
		else return false;
	}

	public String toString() {
		if (isPerfect()) return "" + number + " is perfect.";
		else return "" + number + " is not perfect.";
	}
	
}
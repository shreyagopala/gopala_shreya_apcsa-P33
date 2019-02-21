//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		setNum(0);
	}

	public Triples(int num)
	{

		setNum(num);
	}

	public void setNum(int num)
	{
		number = num;

	}
	
	private boolean greatestCommonFactor(int a, int b, int c)
	{
		int gcf = 0;
		for (int i = 1; i <= number; i++)
		{
			if (a%i==0 && b%i==0 && c%i==0) gcf = i;
		}
		if (gcf == 1) return true;
		else return false;
	}

	public String toString()
	{
		String output="";
		for (int a = 1; a <= number; a++) {
			for (int b = a+1; b <= number; b++) {
				for (int c = b+1; c<= number; c++) {
					if ((a*a)+(b*b) == (c*c)){
						if (((a%2==0 && b%2!=0)||(a%2!= 0 && b%2==0)) && (c%2!=0)) {
							if (greatestCommonFactor(a,b,c)) {
								output += a + " " + b + " " + c + "\n"; 
							}
						}
					}
							
				}
			}
		}
		return output;
	}
}
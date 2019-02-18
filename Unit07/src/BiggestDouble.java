//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class BiggestDouble
{
	private double one,two,three,four;

	public BiggestDouble()
	{
		setDoubles(0,0,0,0);
	}

	public BiggestDouble(double a, double b, double c, double d)
	{
		setDoubles(a,b,c,d);
	}

	public void setDoubles(double a, double b, double c, double d)
	{
		one = a;
		two = b;
		three = c;
		four = d;
	}

	public double getBiggest()
	{
		double max = 0.0;
		{if(one>two&&one>three&&one>four)
			max = one;
		else if(two>one&&two>three&&two>four)
			 max = two;
		else if(three>two&&three>one&&three>four)
			max = three;
		else max = four;
		}
		
		return max;
	}

	public String toString()
	{
	   return "biggest = " + getBiggest() + "\n";
	}
}
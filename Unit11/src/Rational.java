`//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	private int n,d;
	//write two constructors
	public Rational()
	{
		setNumerator(1);
		setDenominator(1);
	}
	public Rational(int nInput, int dInput)
	{
		setNumerator(nInput);
		setDenominator(dInput);
	}
	//write a setRational method
	public void setRational(int nInput, int dInput)
	{
		n = nInput;
		if (d != 0)
	         d = dInput;
	      else
	         d = 1;
	}
	public void setNumerator(int nInput)
	{
		n = nInput;
	}
	public void setDenominator(int dInput)
	{
		if (d != 0) d = dInput;
	}
	

	//write  a set method for numerator and denominator

	
	public void add(Rational  other)
	{
		int newN = ((n*other.d) + (other.n*d));
		int newD = (d*other.d);
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		
		


		reduce();
	}

	private void reduce()
	{
		int gcd = gcd(n,d);
		n = n/gcd;
		d = d/gcd;
	}

	private int gcd(int numOne, int numTwo)
	{
		int t = 0;
	      while (numTwo != 0)
	      {
	         t = numTwo;
	         numTwo = numOne%numTwo;
	         numOne = t;
	      }
	      return numOne;
	}

	public Object clone ()
	{
		Rational r = new Rational(getNumerator(), getDenominator());
		return r;
	}


	//ACCESSORS
	public int getNumerator()
	{
		return n;
	}
	
	public int getDenominator()
	{
		return d;
	}

	//write get methods for numerator and denominator
	
	
	public boolean equals( Object obj)
	{
		Rational rhs = (Rational) obj;
		double one = (double) getNumerator() / getDenominator();
		double two = (double) rhs.getNumerator() / rhs.getDenominator();
		if (one == two)
			return true;
		return false;
	}

	public int compareTo(Rational other)
	{
		
		double top = (double) getNumerator() / other.getDenominator();
		double bottom = (double) other.getNumerator() / other.getDenominator();
		if (top == bottom)
			return 0;
		if (top > bottom)
			return 1;
		return -1;
	}
	
	public String toString() {
		return "(" + getNumerator() + "/" + getDenominator() + ")";
	}


	
	//write  toString() method
	
	
}
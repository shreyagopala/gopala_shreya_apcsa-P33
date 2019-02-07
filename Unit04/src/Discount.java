//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class Discount
{
	//instance variables and constructors could be used, but are not really needed
	private double finalAmount = 0.0;
	//getDiscountedBill() will return final amount of the bill
	//			if the bill is >2000, the bill receives a 15% discount
	public void getDiscountedBill(double amt)
	{
		
		if (amt > 2000)
			finalAmount = 0.85*amt;
		else 
			finalAmount = amt;
			
	}
	
	public double getFinalAmount()
	{
		return finalAmount;
	}
	
	//getter

	public String toString()
	{
		return "Bill Amount = " + getFinalAmount();
	}
}
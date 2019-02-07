//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		out.print("Enter a whole number :: ");
		int num = keyboard.nextInt();
		
		NumberVerify test = new NumberVerify();
		System.out.println(num +" is odd :: " + NumberVerify.isOdd(num));
		System.out.println(num +" is even :: " + NumberVerify.isEven(num));
		
		
		out.print("Enter a whole number :: ");
	
		System.out.println(num +" is odd :: " + NumberVerify.isOdd(num));
		System.out.println(num +" is even :: " + NumberVerify.isEven(num));
		

		out.print("Enter a whole number :: ");
			
		System.out.println(num +" is odd :: " + NumberVerify.isOdd(num));
		System.out.println(num +" is even :: " + NumberVerify.isEven(num));
		
		
	}
}
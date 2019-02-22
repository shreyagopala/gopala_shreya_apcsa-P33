//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import java.util.Scanner;

public class TriangleFiveRunner
{
   public static void main(String args[])
   {
	   Scanner keyboard = new Scanner(System.in);
	   out.println("Enter a letter :: ");
	   char c = keyboard.next().charAt(0);
	   out.println("Enter an amount :: ");
	   int amt = keyboard.nextInt();
	   
	   TriangleFive test = new TriangleFive(c,amt);
	   out.println(test);
	   
	   out.println("Enter a letter :: ");
	   c = keyboard.next().charAt(0);
	   out.println("Enter an amount :: ");
	   amt = keyboard.nextInt();
	   
	   test.setLetter(c);
	   test.setAmount(amt);
	   out.println(test);
	   
	   out.println("Enter a letter :: ");
	   c = keyboard.next().charAt(0);
	   out.println("Enter an amount :: ");
	   amt = keyboard.nextInt();
	   
	   test.setLetter(c);
	   test.setAmount(amt);
	   out.println(test);
	   
	   out.println("Enter a letter :: ");
	   c = keyboard.next().charAt(0);
	   out.println("Enter an amount :: ");
	   amt = keyboard.nextInt();
	   
	   test.setLetter(c);
	   test.setAmount(amt);
	   out.println(test);
	   
	   keyboard.close();
	}
}
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		//ask for name and size
		out.println("Enter 1st monster's name :: ");
		String Name = keyboard.next();
		out.println("Enter 1st monster's size :: ");
		int Size = keyboard.nextInt();
		
		//instantiate monster one
		Monster one = new Skeleton(Name, Size);
		out.println( one );
		
		//ask for name and size
		out.println("Enter 2nd monster's name :: ");
		Name = keyboard.next();
		out.println("Enter 2nd monster's size :: ");
		Size = keyboard.nextInt();
		
		//instantiate monster two
		Monster two = new Skeleton(Name, Size);
		out.println( two );
		if (one.isBigger(two))
			out.println("Monster 1 is bigger than Monster 2");
		else if (one.isSmaller(two))
			out.println("Monster 1 is smaller than Monster 2");
		else  
			out.println("Monster 1 is the same size as Monster 2");
		
		if (one.getName().equals(two.getName())) out.println("Monster 1 has same name as Monster 2");
		else out.println("Monster 1 does not have same name as Monster 1");
		
	}
}
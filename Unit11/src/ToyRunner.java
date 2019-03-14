//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class ToyRunner
{
	public static void main(String[] args)
	{
		Toy test = new Toy("hello");
		test.setCount(5);
		out.println(test.getName());
		out.println(test.getCount());
		
		
	}
}
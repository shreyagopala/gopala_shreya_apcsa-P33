//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListDown
{
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	public boolean go(List<Integer> numArray)
	{
		boolean goingDown = false;
		for (int i = 1; i < numArray.size(); i++)
		{
			if (numArray.get(i) < numArray.get(i-1)) goingDown = true;
			else 
			{
				goingDown = false;
				break;
			}
		}
		return goingDown;
		
}
}
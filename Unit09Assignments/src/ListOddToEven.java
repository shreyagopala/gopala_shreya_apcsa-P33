//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public int go( List<Integer> ray )
	{
		int oddIndex = 0;
		int evenIndex = 0;
		boolean foundOdd = false;
		boolean foundEven = true;
		
		if (ray.size() == 0) return -1;
		
		for(int i = 0; i < ray.size(); i++)
		{
			if (ray.get(i)%2 == 1) 
				{
				foundOdd = true;
				oddIndex = i;
				break;
				}
		}
		for (int j = oddIndex; j < ray.size(); j++)
		{
			if (ray.get(j)%2 == 0)
			{
				foundEven = true;
				evenIndex = j;
			}
		}
		if (!foundOdd || !foundEven) return -1;
		else return evenIndex - oddIndex; 
	}
}
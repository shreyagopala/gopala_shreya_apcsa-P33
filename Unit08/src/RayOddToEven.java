//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public int go(int[] ray)
	{
		int oddIndex = 0;
		int evenIndex = 0;
		boolean foundOdd = false;
		boolean foundEven = false;
		
		if (ray.length == 0) return -1;
		//first lets find the odd number
		for (int i = 0; i < ray.length; i++) 
		{
			if (ray[i]%2 == 0) 
			{
				//this means the number is even
				foundEven = true;
			}
			else //this means the number is odd
			{
				oddIndex = i;
				foundOdd = true;
				break;
			}
		}
		//reset the boolean for even since we have to find next even
		foundEven = false;
		//now lets try to find the next even
		for (int j = oddIndex; j < ray.length; j++) 
		{
			if (ray[j]%2 == 0) 
			{
				evenIndex = j;
				foundEven = true;
				break;
			}
		}
	
		//Return -1 if no odd numbers are found or there are no even numbers following an odd number
		if (!foundOdd || !foundEven) return -1;	
		//Return the distance between the first odd number and the FIRST even number
		return (evenIndex - oddIndex);
	}
}
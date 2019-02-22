//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayDown
{
	//go() will return true if all numbers in numArray are in decreasing order [31,12,6,2,1]
	public boolean go(int[] nums)
	{
		boolean isDecreasing = false;
		for (int i = 1; i < nums.length; i++)
		{
			if (nums[i-1] > nums[i]) isDecreasing = true;
			else break;
		}
		return isDecreasing;
	}	
}
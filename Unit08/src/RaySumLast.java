//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySumLast
{
	public int go(int[] ray)
	{
		if (ray.length == 0) return -1;
		
		int lastVal = ray[ray.length -1];
		int sum = 0;
		
		for (int i = 0; i <ray.length - 1; i++)
		{
			if (ray[i] > lastVal) sum += ray[i];
		}
		if (sum==0) return -1;
		else return sum;
	}
}
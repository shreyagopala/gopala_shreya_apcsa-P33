//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySumLast
{
	public static int go(int[] ray)
	{
		if (ray.length == 0) return -1;
		int val = ray[ray.length -1];
		int sum = 0;
		for (int i = 0; i <ray.length - 1; i++)
		{
			if (ray[i] > val) sum += ray[i];
		}
		if (sum==0) return -1;
		else return sum;
	}
}
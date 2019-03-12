//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -
import java.util.ArrayList;
import java.util.List;

public class OddToEvenRunner
{
	public static void main( String args[] )
	{
		ListOddToEven test = new ListOddToEven();
		List<Integer> ray = new ArrayList<Integer>();
		ray.add(7);
		ray.add(255);
		ray.add(11);
		ray.add(255);
		ray.add(100);
		ray.add(3);
		ray.add(2);
		
		System.out.println(test.go(ray));
	}
}
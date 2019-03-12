//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -
import java.util.List;
import java.util.ArrayList;

public class DownRunner
{
	public static void main( String args[] )
	{	
		ListDown test = new ListDown();
		List<Integer> ray = new ArrayList<Integer>();
		ray.add(5);
		ray.add(4);
		ray.add(3);
		ray.add(2);
		System.out.println(test.go(ray));
	}
}
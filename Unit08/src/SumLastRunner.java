//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class SumLastRunner
{
	public static void main( String args[] )
	{
		RaySumLast test = new RaySumLast();
		System.out.println( test.go( new int[]{-99,1,2,3,4,5,6,7,8,9,10,5} ) );
		System.out.println( test.go( new int[]{10,9,8,7,6,5,4,3,2,1,-99} ) );
		System.out.println( test.go( new int[]{10,20,30,40,50,-11818,40,30,20,10} ) );
		System.out.println( test.go( new int[]{32767} ) );
		System.out.println( test.go( new int[]{9,10,-8,10000,-5000,-3000} ) );
		System.out.println( test.go( new int[]{9,8,7,6,5,4,3,2,0,-2,6} ) );
	}
}
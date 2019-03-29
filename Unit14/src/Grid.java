//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		for (int i = 0; i < grid.length; i++) {
		    for (int j = 0; j < grid[i].length; j++) {
		        grid[i][j] = (Math.random()*10);
		    }
		}
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		int j = 0;
		String firstVal = vals[j];
		int compare = 0;
		int most = 0;
		String mostVal = "";
for (int i = 0; i < vals.length; i++) {
		for (int n = 0; n < vals.length; n++) {
			if ( vals[n].equals(firstVal)) most++;
			if (most > compare) {
				compare = most;
				mostVal = vals[n];
			}
		}
		firstVal = vals[j++];
	}
	return mostVal;
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
		int count = 0;
		for (int i =  0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
			if (grid[i][j] == val) count++;
			}
	}

	//display the grid
	public String toString()
	{
		String output="";
		for (int i = 0; i < grid.length; i++) {
		    for (int j = 0; j < grid[i].length; j++) {
		    	output += grid[i][j];
		    	output += ", ";
		    }
		    return output;
	}
}
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.List;
import java.util.ArrayList;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	List<Integer> total = new ArrayList<>();
    	int sum = 0;
    	int j = 0;
 while (j < m[0].length) {   
    for (int i = 0; i < m.length; i++) {	
    	sum += m[i][j];
    	total.add(sum);
    	}
    j++;
    }
 return total;
}
}

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
		toyList = new ArrayList<Toy>();
	}

	public void loadToys( String toys )
	{
		String[] names = toys.split(" ");
		Toy temp;
		for(int i = 0; i < names.length; i++)
		{
			temp = new Toy(names[i]);
			toyList.add(temp);
		}
	}
	
  
  	public int getThatToy( String nm )
  	{
  		int countNum = 0;
  		for (Toy x : toyList)
  		{
  			if (x.getName().contentEquals(nm)) countNum++;
  		}
  		return countNum;
  	}
  
  	public String getMostFrequentToy()
  	{
  		return "";
  	}  
  
  	public void sortToysByCount()
  	{
  		for (Toy t : toyList)
  		{
  			out.println(t);
  			if (getThatToy(t.getName()) > 1)
  			{
  				t.setCount(getThatToy(t.getName()));
  				int firstIndex = toyList.indexOf(t) + 1;
  				for (int i = firstIndex; i < toyList.size(); i++)
  				{
  					String toyName = t.getName();
  					String arrayToyName = toyList.get(i).getName();
  					out.println(toyName);
  					out.println(arrayToyName);
  					if (toyName.equals(arrayToyName)) 
  						{
  						toyList.remove(i);
  						}
  				}
  			}
  			else if (getThatToy(t.getName()) == 1) t.setCount(1);
  		}
  	}  
  	  
	public String toString()
	{
		String output = "";
		for (Toy toy : toyList)
		{
			output += toy.getName();
			output += " ";
			output += toy.getCount();
			output += ", ";
		}
	   return output;
	}
}
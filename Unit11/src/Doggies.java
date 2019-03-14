//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;
	private int size;

	public Doggies(int size)
	{
		//point pups at a new arry of Dog
		pups = new Dog[size];
		this.size = size;
	
		
	}
	
	public void set(int spot, int age, String name)
	{
		//put a new Dog in the array at spot 
		//make sure spot is in bounds
		pups = new Dog[size];
		if (spot > -1 && spot < pups.length)
			pups[spot] = new Dog(age,name);
	}

	public String getNameOfOldest()
	{
		Dog oldest;
		int age = ;
		
		for (Dog d : pups)
		{
			if (d.getAge() > age)
			{
				oldest = d;
				age = d.getAge();
			}
		}
		return oldest.getName();
	}

	public String getNameOfYoungest()
	{
		Dog youngest;
		int age = ;
		
		for (Dog d : pups)
		{
			if (d.getAge() < age)
			{
				youngest = d;
				age = d.getAge();
			}
		}
		return youngest.getName();
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}
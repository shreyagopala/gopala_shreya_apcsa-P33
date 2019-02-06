//(c) A+ Computer Science 
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;

	//constructor
	public Distance()
	{
	xOne=0;
	xTwo=0;
	yOne=0;
	yTwo=0;
	distance = 0.0;
	}
//constructor
	public Distance(int x1, int y1, int x2, int y2)
	{

		setCoordinates(x1, y1, x2, y2);
		distance = 0.0;
	}
//setter or modifier
	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		x1=xOne;
		y1=yOne;
		x2=xTwo;
		y2=yTwo;	
	}
//function or calculator
	public void calcDistance()
	{
		distance = Math.sqrt((xTwo-xOne)*(xTwo-xOne)+(yTwo-yOne)*(yTwo-yOne));
	}
//getter or accesser (returns an instance/private variable or function)	
	public double getDistance()
	{
		return distance;
	}
	
	//getter

	public String toString()
	{
		return "distance == " + getDistance();
	}
}
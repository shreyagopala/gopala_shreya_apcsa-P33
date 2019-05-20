//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;

	public AlienHorde(int size)
	{
		aliens = new ArrayList<Alien>();
		for(int i = 0; i < size; i++)
		{
			if(i == 0) add(new Alien(0, 0, 2));
			else add(new Alien(aliens.get(i-1).getX() - 50, 0, 2));
		}
	}

	public void add(Alien al)
	{
		aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
		for(Alien alien : aliens) alien.draw(window);		
	}

	public void moveEmAll()
	{
		for(int i = 0; i < aliens.size(); i++)
		{
			Alien a = aliens.get(i);
			a.move("RIGHT");
			if(!a.getOnScreen() && a.getX() + a.getWidth() + a.getSpeed() >= 800)
				a.setOnScreen(true);

			//collides with right wall	
			if((a.getOnScreen() && a.getX() + a.getWidth() + a.getSpeed() >= 800)
				|| (a.getOnScreen() && a.getX() + a.getSpeed() <= 0))
			{
				a.move("DOWN");
				a.setSpeed(-a.getSpeed());
				a.move("RIGHT");
			}
		}
		/*
		for(int i = 0; i < aliens.size(); i++)
		{
			if(i == 0)
			{
				if((aliens.get(i).getX() <= 0 && aliens.get(i).getY() > aliens.get(i+1).getY())
					|| aliens.get(i).getX() >= aliens.get(i+1).getX()) 
					aliens.get(i).move("RIGHT");	
				if((aliens.get(i).getX() + aliens.get(i).getWidth() + aliens.get(i).getSpeed() >= 800 
					&& aliens.get(i).getY() > aliens.get(i+1).getY() + aliens.get(i+1).getHeight())
					|| aliens.get(i).getX() <= aliens.get(i+1).getX()) 
					aliens.get(i).move("LEFT");
				if((aliens.get(i).getX() + aliens.get(i).getWidth() + aliens.get(i).getSpeed() >= 800
					|| aliens.get(i).getX() - aliens.get(i).getSpeed() <= 0)
					&& aliens.get(i).getY() <= aliens.get(i+1).getY() + aliens.get(i+1).getHeight())
					aliens.get(i).move("DOWN");		
			}
			else if(i != 0)
			{
				if(aliens.get(i-1).getX() > aliens.get(i).getX() + aliens.get(i).getWidth()
						|| (aliens.get(i).getX() <= 0 && aliens.get(i-1).getY() == aliens.get(i).getY())
						|| (aliens.get(i).getX() > 400 && aliens.get(i).getY() != aliens.get(i-1).getY())) 
					aliens.get(i).move("RIGHT");				
				if((aliens.get(i).getX() > aliens.get(i-1).getX() + aliens.get(i).getWidth()
					&& aliens.get(i).getY() == aliens.get(i-1).getY())
					|| (aliens.get(i).getX() < 400 && aliens.get(i).getY() != aliens.get(i-1).getY()))
					aliens.get(i).move("LEFT");
				if(aliens.get(i).getY() < aliens.get(i-1).getY() 
					&& (aliens.get(i).getX() + aliens.get(i).getWidth() + aliens.get(i).getSpeed() >= 800
							|| aliens.get(i).getX() - aliens.get(i).getSpeed() <= 0))
					aliens.get(i).move("DOWN");		
			}
		}*/
	}
	
	public List<Alien> getList()
	{
		return aliens;
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
		for(int j = 0; j < shots.size(); j++)
		{
			for(int i = 0; i < aliens.size(); i++)
			{
				if(shots.get(j).getY() - shots.get(j).getSpeed() <= aliens.get(i).getY() + aliens.get(i).getHeight()
					&& shots.get(j).getX() >= aliens.get(i).getX() 
					&& shots.get(j).getX() + shots.get(j).getWidth() <= aliens.get(i).getX() + aliens.get(i).getWidth())
				{
					aliens.remove(i);
					shots.remove(j);
					if(aliens.size() < 1 || shots.size() < 1) break;
				}
			}
		}
		
	}
	
	public void collideWithShip(Ship ship, Graphics window, Bullets shots)
	{
		for(Alien alien : aliens)
		{
			//how must the ship collide with the alien?
			//collide left, collide right/ collide top, collide bottom		
			if((alien.getX() + alien.getWidth() + Math.abs(alien.getSpeed()) >= ship.getX() 
					&& alien.getX() <= ship.getX()
					&& alien.getY() >= ship.getY() 
					&& alien.getY() + alien.getHeight() <= ship.getY() + ship.getHeight()) 
				|| (alien.getX() - Math.abs(alien.getSpeed()) <= ship.getX() + ship.getWidth() 
					&& alien.getX() >= ship.getX()
					&& alien.getY() >= ship.getY() 
					&& alien.getY() + alien.getHeight() <= ship.getY() + ship.getHeight()
				|| (ship.getY() - Math.abs(ship.getSpeed()) <= alien.getY() + alien.getHeight() 
					&& alien.getY() < ship.getY()
					&& alien.getX() >= ship.getX() 
					&& alien.getX() + alien.getWidth() <= ship.getX() + ship.getWidth())
				|| (alien.getY() <= ship.getY() + ship.getHeight() + Math.abs(ship.getSpeed()) 
					&& alien.getY() > ship.getY()
					&& alien.getX() >= ship.getX() 
					&& alien.getX() + alien.getWidth() <= ship.getX() + ship.getWidth())))
			{
				ship.setSpeed(0);
				for(Alien a : aliens) a.setSpeed(0);
				window.drawString("You lose!", 400, 340);
				window.setColor(Color.WHITE);
				
			}
		}
		
	}

	public String toString()
	{
		return "";
	}
}
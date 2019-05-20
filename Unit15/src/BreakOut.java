import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.Font; //imported this
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.*;

public class BreakOut extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle paddle;
	private boolean[] keys;
	private BufferedImage back;
	private List<Block> blocks;
	
	public BreakOut()
	{
		//set up all variables related to the game
		ball = new Ball();
		paddle = new Paddle(400, 300, 40, 40, Color.RED, 5);
		keys = new boolean[4];
		blocks = new ArrayList<Block>();
    
		drawBlocks();
		
    	setBackground(Color.WHITE);
		setVisible(true);
		
		this.addKeyListener(this);		//starts the key thread to log key strokes
		new Thread(this).start();
		
	}
	
   public void update(Graphics window){
	   paint(window);
   }

   public void paint(Graphics window)
   {
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		ball.moveAndDraw(graphToBack);
		paddle.draw(graphToBack);
		
		for(Block b : blocks)
		{
			b.draw(graphToBack);
		}

		//see if ball hits left wall or right wall
		if(!(ball.getX()>=10 && ball.getX()<=780))
		{
			ball.setXSpeed(-ball.getXSpeed());
		}
	
		//see if the ball hits top or bottom wall 
		if(!(ball.getY() >= 10 && ball.getY() <= 580))
		{
			ball.setYSpeed(-ball.getYSpeed());
		}

		//ball hits right side of paddle
		//add speed
		if(ball.getX() <= paddle.getX() + paddle.getWidth() + Math.abs(ball.getXSpeed())
			&& ball.getX() > paddle.getX() + paddle.getWidth()
				&& (ball.getY() >= paddle.getY() 
					&& ball.getY() <= paddle.getY() + paddle.getHeight()
					|| ball.getY() + ball.getHeight() >= paddle.getY() 
					&& ball.getY() + ball.getHeight() < paddle.getY() + paddle.getHeight()))
			ball.setXSpeed(-ball.getXSpeed());
			
		
		//ball hits left side of paddle
		//subtract speed
		if(ball.getX() + ball.getWidth() >= paddle.getX() - Math.abs(ball.getXSpeed())
			&& ball.getX() + ball.getWidth() < paddle.getX()
				&& (ball.getY() >= paddle.getY() 
					&& ball.getY() <= paddle.getY() + paddle.getHeight()
					|| ball.getY() + ball.getHeight() >= paddle.getY() 
					&& ball.getY() + ball.getHeight() < paddle.getY() + paddle.getHeight()))
			ball.setXSpeed(-ball.getXSpeed());
		
				
		//ball hits top of paddle
		if(ball.getY() + ball.getHeight() >= paddle.getY() - Math.abs(ball.getYSpeed()) 
			&& ball.getY() + ball.getHeight() < paddle.getY()
				&& (ball.getX() + ball.getWidth() >= paddle.getX()
					&& ball.getX() <= paddle.getX() + paddle.getWidth()
					|| ball.getX() + ball.getWidth() <= paddle.getX() + paddle.getWidth()
					&& ball.getX() >= paddle.getX())) 
			ball.setYSpeed(-ball.getYSpeed());
			
		//ball hits bottom of paddle
		if(ball.getY() <= paddle.getY() + paddle.getHeight() + Math.abs(ball.getYSpeed())
			&& ball.getY() >= paddle.getY() + paddle.getHeight()
			&& (ball.getX() + ball.getWidth() >= paddle.getX()
					&& ball.getX() <= paddle.getX() + paddle.getWidth()
					|| ball.getX() + ball.getWidth() <= paddle.getX() + paddle.getWidth()
					&& ball.getX() >= paddle.getX()))
			ball.setYSpeed(-ball.getYSpeed());
		
		//check if ball hits any of the blocks
		for(int i = 0; i < blocks.size(); i++)
		{
			Block b = blocks.get(i);
			
			//collides on bottom
			if(ball.getY() <= b.getY() + b.getHeight() + Math.abs(ball.getYSpeed())
				&& ball.getY() > b.getY() + b.getHeight()
				&& (ball.getX() >= b.getX() 
					&& ball.getX() <= b.getX() + b.getWidth()
					|| ball.getX() + ball.getWidth() >= b.getX() 
					&& ball.getX() + ball.getWidth() < b.getX() + b.getWidth()))
			{
				ball.setYSpeed(-ball.getYSpeed());
				disappear(b, i, graphToBack);
				System.out.println(i + " bottom");
			}
			
			//collides on top
			if(ball.getY() + ball.getHeight() >= b.getY() - Math.abs(ball.getYSpeed())
				&& ball.getY() + ball.getHeight() < b.getY()
				&& (ball.getX() >= b.getX() 
					&& ball.getX() <= b.getX() + b.getWidth()
					|| ball.getX() + ball.getWidth() >= b.getX() 
					&& ball.getX() + ball.getWidth() < b.getX() + b.getWidth()))
			{
				ball.setYSpeed(-ball.getYSpeed());
				disappear(b, i, graphToBack);
				System.out.println(i + " top");
			}
			
			//collides on right side
			if(ball.getX() <= b.getX() + b.getWidth() + Math.abs(ball.getXSpeed())
				&& ball.getX() > b.getX() + b.getWidth()
				&& (ball.getY() >= b.getY() 
					&& ball.getY() <= b.getY() + b.getHeight()
					|| ball.getY() + ball.getHeight() >= b.getY() 
					&& ball.getY() + ball.getHeight() <= b.getY() + b.getHeight()))
			{
				ball.setXSpeed(-ball.getXSpeed());
				disappear(b, i, graphToBack);
				System.out.println(i + " right");
			}
			
			//collides on left side
			if((ball.getX() + ball.getWidth() >= b.getX() - Math.abs(ball.getXSpeed())
				&& ball.getX() + ball.getWidth() < b.getX())
				&& (ball.getY() >= b.getY() 
					&& ball.getY() <= b.getY() + b.getHeight()
					|| ball.getY() + ball.getHeight() >= b.getY() 
					&& ball.getY() + ball.getHeight() <= b.getY() + b.getHeight()))
			{
				ball.setXSpeed(-ball.getXSpeed());
				disappear(b, i, graphToBack);
				System.out.println(i + " left");
			}		
		}
		
			//collides on corner
		
		//see if the paddles need to be moved
		if(keys[0]) paddle.moveUpAndDraw(graphToBack); //need to use graphToBack instead of window 
		if(keys[1]) paddle.moveDownAndDraw(graphToBack);
		if(keys[2]) paddle.moveLeftAndDraw(graphToBack);
		if(keys[3]) paddle.moveRightAndDraw(graphToBack);

		twoDGraph.drawImage(back, null, 0, 0);
	}
   
    public void drawBlocks()
    {
    	int begX = 10, endX = 780;
    	int begY = 10, endY = 580;
    	int blockW = 50, blockH = 20;
    	int posX = 10, posY = 10;
    	int gap = 5;
    	
    	//upper row
    	for(int i = 0; i < 2; i++) 
    	{
    		while(posX <= endX)
        	{
        		blocks.add(new Block(posX, posY, blockW, blockH));
        		posX += blockW + gap;  		
        	}
    		posY += blockH + gap;
    		posX = begX;
    	}
    	
    	//lower row
    	posX = begX; 
    	posY = endY - 2 * blockH - gap;	
    	for(int i = 0; i < 2; i++)
    	{
    		while(posX <= endX)
    		{
    			blocks.add(new Block(posX, posY, blockW, blockH));
    			posX += blockW + gap;
    		}
    		posY += blockH + gap;
    		posX = begX;
    	}
    	
    	//left side
    	posX = begX;
    	posY = begY + blockH * 2 + 2 * gap;
    	for(int i = 0; i < 2; i++)
    	{
    		while(posY <= endY - blockH * 2 - 2 * gap)
    		{
    			blocks.add(new Block(posX, posY, blockH, blockW));
    			posY += blockW + gap;
    		}
    		posY = begY + blockH * 2 + 2 * gap;
    		posX += blockH + gap;
    	}
    	
    	//right side
    	posX = endX - blockH - gap * 2;
    	posY = begY + blockH * 2 + 2 * gap;
    	for(int i = 0; i < 2; i++)
    	{
    		while(posY <= endY - blockH * 2 - 2 * gap)
    		{
    			blocks.add(new Block(posX, posY, blockH, blockW));
    			posY += blockW + gap;
    		}
    		posY = begY + blockH * 2 + 2 * gap;
    		posX += blockH + gap;
    	} 	
    }
    
    public void disappear(Block b, int pos, Graphics window)
    {
    	b.draw(window, Color.WHITE);
    	b.setHeight(0);
    	b.setWidth(0);
    	blocks.remove(pos);
    	
    	if(isEmpty())
    	{
    		ball.setXSpeed(0);
			ball.setYSpeed(0);
			ball.draw(window, Color.WHITE);
    		
			paddle.draw(window, Color.WHITE);
			
    		paddle.setX(400);
    		paddle.setY(300);
    		ball.setX(30);
    		ball.setY(50);
    		ball.setXSpeed(3);
    		ball.setYSpeed(1);
    		drawBlocks();
    	}
    }
    
    public boolean isEmpty()
    {
    	return(blocks.size() == 0);
    }

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
			case 'A' : keys[2]=true; break;
			case 'D' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
			case 'A' : keys[2]=false; break;
			case 'D' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}

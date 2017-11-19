package guimodule;

import processing.core.PApplet;

public class MySmiley extends PApplet 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void setup()
	{
		size(600, 600);
		background(200, 200, 200);
		
	}
	
	public void draw()
	{
		// parameters: x, y, w, h
		fill(255, 215, 23);
		ellipse(100, 100, 200, 200);
		fill(0,0,0);
		ellipse(60, 70, 20, 50);
		ellipse(140, 70, 20, 50);
		
		noFill();
		arc(105, 120, 75, 75, 0, PI);
		
	}

}

import processing.core.PApplet;
import processing.core.PImage;

public class MySun extends PApplet 
{
	private String url = "palmTrees.jpg";
	private PImage backgroundImg;
	
	public void setup()
	{
		size(800,800);
		background(255);
		stroke(0);
		backgroundImg = loadImage(url, "jpg");

	}
	
	public void draw()
	{
		background(0);
		backgroundImg.resize(0, height);
		image(backgroundImg,0,0);
		fill(255,209,0);
		ellipse(width/4, height/5, width/5, height/5);
	}
}

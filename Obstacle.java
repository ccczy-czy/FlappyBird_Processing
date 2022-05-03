import processing.core.*;

public class Obstacle extends PApplet{
	public float posx;
	public float posy;
	public GamePlay parent;
	
	public Obstacle (GamePlay p, int i) {
		this.parent = p;
		this.posx = i;
		this.posy = (float) (0+Math.random()*(parent.height-200));
		
	}
	
	public void move(int flag) {
		if (flag == 1)
			this.posx = this.posx-1;
		if (this.posx == 0)
			this.posx = parent.width;
	}
	
	public void drawObstacle() {
		parent.line(posx, 0, posx, posy);
		parent.line(posx, posy+200, posx, parent.height);
	}
	

}

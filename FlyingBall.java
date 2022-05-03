import processing.core.*;

public class FlyingBall extends PApplet {
	public float posx;
	public float posy;
	public float rad = 20f;
	public float speedX = 0f;
	public float speedY = 3f;
	public GamePlay parent;
	
	public FlyingBall (GamePlay p) {
		this.parent = p;
		this.posx = 40;
		this.posy = p.height/2;
	}
	
	public void move(int flag) {
		if (flag == 1)
			this.posy = this.posy-10;
		else {
			this.posy = this.posy+speedY;
			this.posx = this.posx+speedX;
		}
	}
	
	public void drawBall() {
		parent.fill(255, 255, 102);
		parent.ellipse(posx, posy, rad, rad);
	}
	

}

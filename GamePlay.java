import processing.core.*;
public class GamePlay extends PApplet{
	PImage bg;
	Obstacle[] obstacles = new Obstacle[5];
	Obstacle o;
	FlyingBall b;
	int flag = 0;
	int flag2 = 0;
	
	public void setup() {
		size(700,504);
		bg = loadImage("background.png");
		bg.resize(700, 504);
		for (int i = 0; i < 5; i++) {
			obstacles[i] = new Obstacle(this,i*100);
		}
		//o = new Obstacle(this,100);
		b = new FlyingBall(this);
		strokeWeight(8);
	}
	
	public void draw() {
		background(bg);
		b.drawBall();
		for (Obstacle i: obstacles)
			i.drawObstacle();
		//o.drawObstacle();
		if (mousePressed) {
			flag = 1;
			flag2 = 1;
		}
		//o.move(flag);
		for (Obstacle i: obstacles)
			i.move(flag);
		b.move(flag2);
		flag2 = 0;
		for (Obstacle i: obstacles) {
			if ((b.posx+b.rad) == i.posx && ((b.posy-b.rad)<=i.posy || (b.posy+b.rad) >= i.posy+200)) {
				noLoop();
				text("Game Over", width/2, height/2);
			}
		}
		/*if ((b.posx+b.rad) == o.posx && ((b.posy-b.rad)<=o.posy || (b.posy+b.rad) >= o.posy+200)) {
			noLoop();
			text("Game Over", width/2, height/2);
		}
		*/
	}

	public static void main(String[] args) {
		PApplet.main("GamePlay");

	}

}

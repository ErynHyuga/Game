package at.kogler.basics.FirstGame;

import org.newdawn.slick.Graphics;

public class Ellipse implements Actor {

    private int x,y;
    private float speed;
    public Ellipse(int x, int y) {
        this.x = x;
        this.y = y;
        this.speed = 2;
    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawOval(this.x,this.y,50,20);
    }

    @Override
    public void update(int delta) {
        directionDown(delta);
        directionRight(delta);
        if (this.y >= 600) {
            this.y = -25;
        }
        if (this.x >= 800){
            this.x = 0;
        }

    }
    public void directionUp(int delta) {
        this.y -= (float) delta / this.speed;
    }
    public void directionDown(int delta) {
        this.y += (float) delta / this.speed;
    }
    public void directionRight(int delta) {
        this.x += (float) delta / this.speed;
    }
    public void directionLeft(int delta) {
        this.x -= (float) delta / this.speed;
    }
}

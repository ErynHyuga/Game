package at.kogler.basics.FirstGame;

import org.newdawn.slick.Graphics;

import java.util.Random;

public class Circle implements PrimariusActor {

    private int size0 = 20;
    Random random = new Random();
    public enum DIRECTION {RIGHT, DOWN, LEFT, UP};
    private int x, y;
    private float speed;
    private float diameter;
    private DIRECTION direction = DIRECTION.LEFT;

    public Circle(int x, int y, DIRECTION direction) {
        this.x = x;
        this.y = y;
        this.speed = 2;
        this.diameter = random.nextInt(20) + 20;
        this.direction = direction;
    }

    public void render(Graphics graphics) {
        graphics.drawOval(this.x, this.y, this.diameter, this.diameter);

    }

    public void update(int delta) {
        //resetter not working :sad:
        if(this.y >= 600){
            this.diameter = size0;
        }
        this.diameter += 0.05;
        switch (direction){
            case RIGHT:
                directionRight(delta);
                break;
            case LEFT:
                directionLeft(delta);
                break;
            case DOWN:
                directionDown(delta);
                break;
            case UP:
                directionUp(delta);
                break;
        }
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

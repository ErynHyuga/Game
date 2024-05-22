package at.kogler.basics.FirstGame;

import org.newdawn.slick.Graphics;

import java.util.Random;

public class Circle {


    private int x, y;
    private float speed;
    private int diameter;

    public Circle() {
        Random random = new Random();
        this.x = random.nextInt(800);
        this.y = random.nextInt(600);
        this.speed = random.nextInt(2) + 2;
        this.diameter = random.nextInt(20) + 20;
    }

    public void render(Graphics graphics) {
        graphics.drawOval(this.x, this.y, this.diameter, this.diameter);

    }

    public void update(int delta) {
        directionRight(delta);


        if (this.y >= 600) {
            this.y = 0;
        }
        if (this.x >= 800){
            this.x = 0;
        }
    }

    public void directionUp(int delta) {
        this.y -= (float) delta / this.speed;
    }
    public void directionDown(int delta) {
        this.y -= (float) delta / this.speed;
    }
    public void directionRight(int delta) {
        this.x += (float) delta / this.speed;
    }
    public void directionLeft(int delta) {
        this.x -= (float) delta / this.speed;
    }

}
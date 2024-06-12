package at.kogler.basics.FirstGame;


import org.newdawn.slick.Graphics;

public class Rectangle implements PrimariusActor {
    public enum DIRECTION {RIGHT, DOWN, LEFT, UP};
    private int x;
    private int y;
    private float speed;

    private DIRECTION direction = DIRECTION.RIGHT;


    public Rectangle(int x, int y, float speed, DIRECTION direction) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.direction = direction;
    }

    public void render(Graphics graphics) {
        graphics.drawRect(this.x, this.y, 20, 20);

    }

    public void update(int delta) {

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

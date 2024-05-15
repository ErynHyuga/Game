package at.kogler.basics.FirstGame;


import org.newdawn.slick.Graphics;

public class Rectangle {
    public enum DIRECTION {RIGHT, DOWN, LEFT, UP};

   private int width;
   private int height;
    private int x;
    private int y;
    private float speed;

    public Rectangle(int x, int y, int width, int height, float speed) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.speed = speed;
    }

    public void render(Graphics graphics) {
        graphics.drawRect(this.x, this.y, this.width, this.height);

    }

    public void update(int delta) {
        this.x += (float) delta / this.speed;if (this.x > 600) {
            this.x = 0;
        }
        directionRight();
    }

    public void directionUp() {
        y++;
    }

    public void directionDown() {
        y--;
    }

    public void directionRight() {
        x++;
    }
    public void directionLeft() {
        x--;
    }


}

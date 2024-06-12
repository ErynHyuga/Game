package at.kogler.basics.Snowflake;

import at.kogler.basics.Snowflake.Actor;
import org.newdawn.slick.Graphics;
import java.util.Random;

public class Snowflake implements Actor {



    private int x,y;
    private float speed;
    private int diameter;


    public Snowflake(int x, int y, int diameter) {
        this.x = x;
        this.y = y;
        this.speed = 3;
        this.diameter = diameter;
    }

    @Override
    public void render(Graphics graphics) {
        graphics.fillOval(this.x,this.y,this.diameter,this.diameter);
        
    }

    @Override
    public void update(int delta) {
  directionDown(delta);
        if (this.y >= 600) {
            this.y = -25;
        }
        if (this.x >= 800){
            this.x = 0;
        }

    }

    public void directionDown(int delta) {
        this.y += (float) delta / this.speed;
    }

}

package at.kogler.basics.Snowflake;

import at.kogler.basics.Snowflake.Actor;
import org.newdawn.slick.Graphics;
import java.util.Random;

public class Snowflake implements Actor {

    public enum TYPE {BIG, SMALL, MEDIUM};
    private TYPE type;
    private int x,y;
    private float speed;
    private int diameter;

    public Snowflake(TYPE type, int x, int y, float speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.type = type;
        if (type == TYPE.BIG){
            this.diameter = 15;
            this.speed = 7;
        }
        if (type == TYPE.MEDIUM){
            this.diameter = 11;
            this.speed = 11;
        }
        if (type == TYPE.SMALL){
            this.diameter = 7;
            this.speed = 15;
        }

    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawOval(this.x,this.y,20,20);
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

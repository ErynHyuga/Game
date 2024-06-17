package at.kogler.basics.Rocketman;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Rocket implements KomorovActor {
    private Image rocketBlueprint;
    private int x, y;
    private float speed;
    private int length, width;



    public Rocket( ) {
        try {
            this.rocketBlueprint = new Image("testdata/soyuzR7.png");
            this.x = 100;
            this.y = 1;
            this.speed = 2;
            this.length = 600;
            this.width = 150;

        } catch (SlickException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void render(Graphics graphics) {
        rocketBlueprint.draw();


    }

    public void update(int delta) {

        if (this.y >= 800) {
            this.y = 0 - length;
        }
        if (this.x >= 1200) {
            this.x = 0 - length;
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

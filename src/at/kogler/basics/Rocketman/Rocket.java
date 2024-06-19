package at.kogler.basics.Rocketman;
import org.newdawn.slick.*;

import java.util.Dictionary;

public class Rocket implements KomorovActor {
    private Image rocketBlueprint;
    private int x, y;
    private float speed;
    private int length, width;
    private char up,down,port,starboard;
    public Rocket() {
        try {

            Image tmp = new Image("testdata/soyuzR7.png");
            this.rocketBlueprint = tmp.getScaledCopy(150,600);
            this.speed = 2;
            this.length = 600;
            this.width = 150;

        } catch (SlickException e) {
            System.out.println(e.getMessage());
        }
    }

    public void render(Graphics graphics) {
        rocketBlueprint.draw(this.x, this.y);
    }

    public void update(GameContainer gameContainer, int delta) {
        if (gameContainer.getInput().isKeyDown(Input.KEY_D)){
            directionRight(delta);
        }else if (gameContainer.getInput().isKeyDown(Input.KEY_D) && gameContainer.getInput().isKeyDown(Input.KEY_LSHIFT)){
            directionFasterRight(delta);
        }

        if (gameContainer.getInput().isKeyDown(Input.KEY_A)){
            directionLeft(delta);
        }else if (gameContainer.getInput().isKeyDown(Input.KEY_A) && gameContainer.getInput().isKeyDown(Input.KEY_LSHIFT)){
            directionFasterLeft(delta);
        }

        if (gameContainer.getInput().isKeyDown(Input.KEY_S)){
            directionDown(delta);
        }else if (gameContainer.getInput().isKeyDown(Input.KEY_W) && gameContainer.getInput().isKeyDown(Input.KEY_LSHIFT)){
            directionFasterDown(delta);
        }

        if (gameContainer.getInput().isKeyDown(Input.KEY_W)){
            directionUp(delta);
        }else if (gameContainer.getInput().isKeyDown(Input.KEY_W) && gameContainer.getInput().isKeyDown(Input.KEY_LSHIFT)){
            directionFasterUp(delta);
        }

        System.out.println("x:" + x + " y:" + y);

        if (this.y >= 800) {
            this.y = 0 - length;
        }
        if (this.x >= 1200) {
            this.x = 0 - width;
        }
    }



    public void directionUp(int delta) {
        this.y -= (float) delta / this.speed;
    }
    public void directionFasterUp(int delta) {
        this.y -=  (float) delta / this.speed + 2;
    }


    public void directionDown(int delta) {
        this.y += (float) delta / this.speed;
    }
    public void directionFasterDown(int delta) {
        this.y += 2 + (float) delta / this.speed;
    }


    public void directionRight(int delta) {
        this.x += (float) delta / this.speed;
    }
    public void directionFasterRight(int delta) {
        this.x += 2 + (float) delta / this.speed;
    }


    public void directionLeft(int delta) {
        this.x -= (float) delta / this.speed;
    }
    public void directionFasterLeft(int delta) {
        this.x -= 2 + (float) delta / this.speed;
    }

}

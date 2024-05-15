package at.kogler.basics.FirstGame;


import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.Random;
import java.util.List;

public class ObjectClass extends BasicGame {

    private List<Rectangle> rectangles;



    public ObjectClass(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {



    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        for (Rectangle rectangle : this.rectangles) {
            rectangle.update(delta);
        }
        
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (Rectangle rectangle : this.rectangles) {
            rectangle.render(graphics);
        }
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new ObjectClass("Recteck"));
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }

    }
}

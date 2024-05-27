package at.kogler.basics.FirstGame;


import org.newdawn.slick.*;

import java.util.ArrayList;

import java.util.Random;
import java.util.List;

public class ObjectClass extends BasicGame {
    private List<Actor> actors;


    public ObjectClass(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.actors = new ArrayList<>();

        Random random = new Random();
        //adding Rectangles
        for (int i = 0; i < 10; i++) {
            Rectangle rectangle = new Rectangle(random.nextInt(800),
                    random.nextInt(600), 2, Rectangle.DIRECTION.RIGHT);
            this.actors.add(rectangle);
        }
        //adding Circles
        for (int i = 0; i < 10; i++) {
            Circle circle = new Circle(random.nextInt(800), random.nextInt(600), Circle.DIRECTION.DOWN);
            this.actors.add(circle);
        }
        //adding Ellipses
        for (int i = 0; i < 10; i++) {
            Ellipse ellipse = new Ellipse(random.nextInt(800), random.nextInt(600), Ellipse.DIRECTION.DOWN);
            this.actors.add(ellipse);
        }

    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        for (Actor actor :
                this.actors) {
            actor.update(delta);
        }

    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (Actor actor :
                this.actors) {
            actor.render(graphics);
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

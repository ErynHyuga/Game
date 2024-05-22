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
        for (int i = 0; i < 100; i++) {
            Rectangle rectangle = new Rectangle(random.nextInt(800),
                    random.nextInt(600), random.nextInt(2));
            this.actors.add(rectangle);
        }
        for (int i = 0; i < 50; i++) {
            Circle circle = new Circle();
            this.actors.add(circle);
        }
        for (int i = 0; i < 20; i++) {
            Ellipse ellipse = new Ellipse(random.nextInt(800), random.nextInt(600));
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

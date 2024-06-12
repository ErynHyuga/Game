package at.kogler.basics.Snowflake;

import org.newdawn.slick.*;

import java.util.ArrayList;

import java.util.Random;
import java.util.List;

public class Snowworld extends BasicGame {
    private List<Actor> actors;


    public Snowworld(String title) {
        super(title);
        
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.actors = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            Snowflake snowflake1 = new Snowflake(random.nextInt(800),
                    random.nextInt(600), 10);
            Snowflake snowflake2 = new Snowflake(random.nextInt(800),
                    random.nextInt(600),15);
            Snowflake snowflake3 = new Snowflake(random.nextInt(800),
                    random.nextInt(600), 20);

            actors.add(snowflake1);
            actors.add(snowflake2);
            actors.add(snowflake3);

        }
    }
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
            AppGameContainer container = new AppGameContainer(new Snowworld("Snowflake"));
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }

    }
}

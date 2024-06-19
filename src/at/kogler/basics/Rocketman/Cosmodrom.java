package at.kogler.basics.Rocketman;



import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cosmodrom extends BasicGame {
    private List<KomorovActor> rocketActors;


    public Cosmodrom(String title) throws SlickException {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.rocketActors = new ArrayList<>();
        Random random = new Random();
        Rocket rocket = new Rocket();
        this.rocketActors.add(rocket);

    }

    public void keyPressed(int key, char c){
        System.out.println(key);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        for (KomorovActor actor :
                this.rocketActors) {
            actor.update(gameContainer, delta);
        }
    }


    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (KomorovActor actor :
                this.rocketActors) {
            actor.render(graphics);
        }
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Cosmodrom("Rocketman"));
            container.setDisplayMode(1200, 800, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }

    }

}

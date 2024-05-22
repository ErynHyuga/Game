package at.kogler.basics.FirstGame;


import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.List;

public class ObjectClass extends BasicGame {

    private List<Rectangle> rectangles;
    private List<Circle> circles;


    public ObjectClass(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.circles = new ArrayList<>();
        this.rectangles = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            Rectangle rectangle = new Rectangle(random.nextInt(600),
                    random.nextInt(600), random.nextInt(2));
            rectangles.add(rectangle);
        }
        for (int i = 0; i < 50; i++) {
            Circle circle = new Circle();
            circles.add(circle);
        }

    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        for (Rectangle rectangle : this.rectangles) {
            rectangle.update(delta);
        }
        for (Circle circle : this.circles) {
            circle.update(delta);
        }

    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (Rectangle rectangle : this.rectangles) {
            rectangle.render(graphics);
        }
        for (Circle circle : this.circles) {
            circle.render(graphics);
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

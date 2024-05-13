package at.kogler.basics.FirstGame;


import org.newdawn.slick.*;

public class ObjectClass extends BasicGame {
    private Rectangle rect1;
    private Rectangle rect2;

    public ObjectClass(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.rect1 = new Rectangle(150, 150, 55);
        this.rect2 = new Rectangle(150, 150, 55);


    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        this.rect1.update(delta);
        this.rect2.update(delta);
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        this.rect1.render(graphics);
        this.rect2.render(graphics);
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

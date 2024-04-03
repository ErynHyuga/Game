package at.kogler.basics.FirstGame;


import org.newdawn.slick.*;

public class Rectangle extends BasicGame {
    private int textSpeedInX;
    private int textSpeedInY;
    private int oval1SpeedInX;
    private int oval1SpeedInY;
    private int oval2SpeedInX;
    private int oval2SpeedInY;
    private float speed;
    public Rectangle(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.textSpeedInX = 10;
        this.textSpeedInY = 25;
        this.speed = 2;
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {


        this.textSpeedInY += (double)delta/speed;
        this.textSpeedInX += (double)delta/speed;
        if(this.textSpeedInX > 800){
            this.textSpeedInX = 10;
        }
        if(this.textSpeedInY > 600){
            this.textSpeedInY = 20;
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawString("Zäwäs", this.textSpeedInX,this.textSpeedInY);
        graphics.drawRect(100,200,30,10);
        graphics.drawOval(this.oval1SpeedInX, this.oval1SpeedInY,20);
        graphics.drawOval(this.oval2SpeedInX, this.oval2SpeedInY, 40);

    }
    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Rectangle("Recteck"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}

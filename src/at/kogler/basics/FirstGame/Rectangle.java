package at.kogler.basics.FirstGame;


import org.newdawn.slick.*;

public class Rectangle extends BasicGame {


    private int xOfRect1;
    private int yOfRect1;
    private int xOfOv1;
    private int yOfOv1;

    private int xOfOv2;
    private int yOfOv2;

    public void directionUpRect1() {
        yOfRect1++;
    }

    public void directionDownRect1() {
        yOfRect1--;
    }

    public void directionLeftRect1() {
        xOfRect1--;
    }

    public void directionRightRect1() {
        xOfRect1++;
    }

    public void directionLeftOv1() {
        xOfOv1--;
    }

    public void directionRightOv1() {
        xOfOv1++;
    }

    public void directionUpOv2() {
        yOfOv2++;
    }

    public void directionDownOv2() {
        yOfOv2--;
    }

    public int i;
    public int ib;

    public Rectangle(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {

        this.xOfRect1 = 100;
        this.yOfRect1 = 100;

    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        if (this.xOfRect1 < 650 && this.yOfRect1 <= 150) {
            directionRightRect1();
        } else if (this.xOfRect1 > 150 && this.yOfRect1 == 450) {
            directionLeftRect1();
        } else if (this.xOfRect1 == 150 && this.yOfRect1 > 150) {
            directionDownRect1();
        } else if (this.xOfRect1 == 650 && this.yOfRect1 < 450) {
            directionUpRect1();
        }

        if ((i + 1) % 2 == 1) {
            directionRightOv1();
            if (xOfOv1 == 460) {
                i++;
            }
        } else if ((i + 1) % 2 == 0) {
            directionLeftOv1();
            if (xOfOv1 == 60) {
                i--;
            }
        }


        if ((ib + 1) % 2 == 1) {
            System.out.println("inside1");
            directionUpOv2();
            if (yOfOv2 == 550) {
                ib++;
            }
        } else if ((ib + 1) % 2 == 0) {
            System.out.println("inside 2");
            directionDownOv2();
            if (yOfOv2 == 50) {
                ib--;
            }
        }


    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawRect(this.xOfRect1, this.yOfRect1, 50, 50);
        graphics.drawOval(this.xOfOv1, this.yOfOv1, 40, 15);
        graphics.drawOval(this.xOfOv2, this.yOfOv2, 15, 40);

    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Rectangle("Recteck"));
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}

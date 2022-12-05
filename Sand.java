import java.awt.*;
import java.applet.*;

public class Sand {

    public static void drawSand(Graphics g){
      g.setColor(new Color(255,255,204));
      g.fillRect(0,650,2000,325);
    }

    public static void drawCrab(Graphics g){
        g.setColor(Color.red);
        int x1 = 100;
        int x2 = 200;
        //body
        g.fillOval(150,750,100,150);
        //legs
        g.fillOval(x1,780,100,10);
        g.fillOval(x1,820,100,10);
        g.fillOval(x1,860,100,10);
        g.fillOval(x2,780,100,10);
        g.fillOval(x2,820,100,10);
        g.fillOval(x2,860,100,10);
        //eyes
        g.setColor(Color.black);
        g.fillOval(175,760,10,10);
        g.fillOval(215,760,10,10);
        }


    }


import java.awt.*;
import java.applet.*;

public class Ocean {

    public static void drawOcean(Graphics g) {
        g.setColor(Color.blue);
        g.fillRect(0,320,2000,400);

    }

    public static void drawSky(Graphics g){
        g.setColor(Color.cyan);
        g.fillRect(0,10,2000,310);

    }

    public static void drawWaves(Graphics g){
        g.setColor(Color.white);
        g.fillRect(150,600,100,10);
        g.fillRect(450,500,100,10);
        g.fillRect(800,400,100,10);
        g.fillRect(800,600,100,10);
        g.fillRect(100,400,100,10);
        g.fillRect(1200,475,100,10);
        g.fillRect(1700,500,100,10);
        g.fillRect(1600,600,100,10);

    }
}

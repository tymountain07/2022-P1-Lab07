import java.awt.*;
import java.applet.*;

public class Boat {

    public static void drawBody(Graphics g){
        g.setColor(new Color(208,163,132));
        Polygon boat = new Polygon();
        boat.addPoint(800,450);
        boat.addPoint(1000,650);
        boat.addPoint(1200,650);
        boat.addPoint(1400,450);
        g.fillPolygon(boat);
    }

    public static void drawSail(Graphics g){
        g.fillRect(900,350,20,100);

        Polygon sail = new Polygon();
        sail.addPoint(800,350);
        sail.addPoint(1000,350);
        sail.addPoint(1000, 150);
        g.setColor(Color.white);
        g.fillPolygon(sail);

    }

    public static void drawPlank(Graphics g){
        g.setColor(new Color(208,163,132));
        g.fillRect(750,450,60,10);

    }

    public static void drawWheel(Graphics g){
        g.fillOval(810,390,40,40);
        g.fillRect(825,420,10,30);

    }
}

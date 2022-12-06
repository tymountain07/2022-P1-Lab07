import java.awt.*;
import java.applet.*;

public class Beach extends Applet {

    public void paint(Graphics g) {

        Sand.drawSand(g);
        Sand.drawCrab(g);

        Ocean.drawOcean(g);
        Ocean.drawSky(g);
        Ocean.drawWaves(g);

        Boat.drawBody(g);
        Boat.drawSail(g);
        Boat.drawPlank(g);
        Boat.drawWheel(g);
    }

}

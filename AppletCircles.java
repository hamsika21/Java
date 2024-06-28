import java.awt.*;
import java.applet.*;

/* 
   Description: An applet demonstrating drawing colored ovals using Java's AWT library.
   
   <applet code=Aclass width=1200 height=1500></applet>
*/
public class Aclass extends Applet {

    // Override paint method to draw graphics
    public void paint(Graphics g) {
        // Draw large cyan filled oval
        g.setColor(Color.cyan);
        g.fillOval(200, 300, 700, 700);
        
        // Draw large cyan outline oval
        g.setColor(Color.blue);
        g.drawOval(200, 300, 700, 700);
        
        // Draw smaller yellow filled oval
        g.setColor(Color.yellow);
        g.fillOval(400, 500, 300, 300);
        
        // Draw smaller blue outline oval
        g.setColor(Color.blue);
        g.drawOval(400, 500, 300, 300);
    }
}

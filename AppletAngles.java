import java.awt.*;
import java.applet.*;

/* 
   Description: An applet demonstrating drawing arcs with specified angles using Java's AWT library.
   
   <applet code=Prac5 width=1500 height=1500></applet>
*/
public class Prac5 extends Applet {

    // Override paint method to draw graphics
    public void paint(Graphics g) {
        // Set color to red and draw arcs
        g.setColor(Color.red);
        
        // Draw arc from 3 o'clock to 6 o'clock (270 degrees)
        g.drawArc(400, 400, 300, 300, 0, -90);
        
        // Draw arc from 9 o'clock to 12 o'clock (270 degrees)
        g.drawArc(400, 400, 300, 300, 180, -90);
        
        // Set color to black and draw arcs with specific angles
        g.setColor(Color.black);
        
        // Draw arc with a 60-degree angle starting from 196 degrees
        g.drawArc(600, 400, 300, 300, 196, 60);
        
        // Draw arc with a 70-degree angle starting from 188 degrees
        g.drawArc(400, 200, 300, 300, 188, 70);
    }
}

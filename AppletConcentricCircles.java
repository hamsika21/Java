import java.awt.*;
import java.applet.*;

/* 
   <applet code=Pract8 width=1200 height=1500></applet>
*/
public class Pract8 extends Applet {

    // Override paint method to draw graphics
    public void paint(Graphics g) {
        long i; // Variable declaration for loop delay

        // Draw outer circles
        g.drawOval(200, 200, 500, 500);
        g.drawOval(250, 250, 400, 400);

        // Animation loop for filling arcs with different colors
        for (int j = 0; j < 20; j++) {
            g.setColor(Color.white); // Set color to white
            g.fillOval(275, 275, 350, 350); // Fill inner oval with white
            g.setColor(Color.black); // Set color to black
            g.fillArc(300, 300, 300, 300, 30 * j, 90); // Fill arc with black
            g.setColor(Color.green); // Set color to green
            g.fillArc(300, 300, 300, 300, 90 + 30 * j, 90); // Fill arc with green
            g.setColor(Color.red); // Set color to red
            g.fillArc(300, 300, 300, 300, 180 + 30 * j, 90); // Fill arc with red
            g.setColor(Color.blue); // Set color to blue

            // Delay loop to control animation speed
            for (i = 1; i < 1000000000; i++);
        }
    }
}

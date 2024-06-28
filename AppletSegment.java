import java.awt.*;
import java.applet.*;

/* 
     <applet code=Pract7 width=1200 height=1500></applet>
*/
public class Pract7 extends Applet {

    // Override paint method to draw graphics
    public void paint(Graphics g) {
        long i; // Variable declaration for loop delay
        
        setBackground(Color.yellow); // Set background color to yellow
        
        // Animation loop for drawing lines and rectangles with different colors
        for (int j = 0; j < 5; j++) {
            g.setColor(Color.black); // Set color to black
            g.drawLine(100, 300, 500, 300); // Draw a black horizontal line
            for (i = 1; i < 1000000000; i++); // Delay loop
            
            g.setColor(Color.yellow); // Set color to yellow
            g.fillRect(100, 100, 400, 400); // Fill a yellow rectangle
            for (i = 1; i < 1000000000; i++); // Delay loop
            
            g.setColor(Color.blue); // Set color to blue
            g.drawLine(162, 444, 440, 157); // Draw a blue diagonal line
            for (i = 1; i < 1000000000; i++); // Delay loop
            
            g.setColor(Color.yellow); // Set color to yellow
            g.fillRect(100, 100, 400, 400); // Fill a yellow rectangle
            for (i = 1; i < 1000000000; i++); // Delay loop
            
            g.setColor(Color.green); // Set color to green
            g.drawLine(300, 100, 300, 500); // Draw a green vertical line
            for (i = 1; i < 1000000000; i++); // Delay loop
            
            g.setColor(Color.yellow); // Set color to yellow
            g.fillRect(100, 100, 400, 400); // Fill a yellow rectangle
            for (i = 1; i < 1000000000; i++); // Delay loop
            
            g.setColor(Color.red); // Set color to red
            g.drawLine(158, 159, 442, 440); // Draw a red diagonal line
            for (i = 1; i < 1000000000; i++); // Delay loop
            
            g.setColor(Color.yellow); // Set color to yellow
            g.fillRect(100, 100, 400, 400); // Fill a yellow rectangle
            for (i = 1; i < 1000000000; i++); // Delay loop
        }
    }
}

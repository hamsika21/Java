import java.awt.*;
import java.applet.*;

/* 
   Description: An applet demonstrating drawing shapes (square, circle, ellipse, rectangle) 
                with alternating colors and animations.
   
   <applet code=Pract10 width=1000 height=1000></applet>
*/
public class Pract10 extends Applet {

    // Override paint method to draw graphics
    public void paint(Graphics g) {
        long i; // Variable declaration for loop delay
        
        g.drawLine(100, 500, 700, 500); // Horizontal line
        
        // SQUARE
        g.setColor(Color.black);
        g.drawRect(270, 270, 200, 200); // Outline of a square
        for (i = 1; i <= 999999999; i++); // Delay
        g.setColor(Color.white); 
        g.drawRect(270, 270, 200, 200); // White out the square
        for (i = 1; i <= 999999999; i++); // Delay
        
        // CIRCLE
        g.setColor(Color.black);
        g.drawOval(240, 240, 240, 240); // Outline of a circle
        for (i = 1; i <= 999999999; i++); // Delay
        g.setColor(Color.white); 
        g.drawOval(240, 240, 240, 240); // White out the circle
        for (i = 1; i <= 999999999; i++); // Delay
        
        // ELLIPSE
        g.setColor(Color.black);
        g.drawOval(240, 240, 340, 240); // Outline of an ellipse
        for (i = 1; i <= 999999999; i++); // Delay
        g.setColor(Color.white); 
        g.drawOval(240, 240, 340, 240); // White out the ellipse
        for (i = 1; i <= 999999999; i++); // Delay
        
        // RECTANGLE
        g.setColor(Color.black);
        g.drawRect(240, 240, 340, 240); // Outline of a rectangle
        for (i = 1; i <= 999999999; i++); // Delay
        g.setColor(Color.white); 
        g.drawRect(240, 240, 340, 240); // White out the rectangle
        for (i = 1; i <= 999999999; i++); // Delay
        
        // Display all shapes simultaneously
        g.setColor(Color.black);
        g.drawRect(270, 270, 200, 200); // Square
        g.drawOval(240, 240, 240, 240); // Circle
        g.drawOval(240, 240, 340, 240); // Ellipse
        g.drawRect(240, 240, 340, 240); // Rectangle
    }
}

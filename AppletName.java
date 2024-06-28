import java.awt.*;
import java.applet.*;

/* 
   Description: An applet demonstrating text animation for displaying my name "HAMSIKA" 
                with different colors, styles, and animations.
   
   <applet code=Pract9 width=1200 height=1500></applet>
*/
public class Pract9 extends Applet {

    // Override paint method to draw graphics
    public void paint(Graphics g) {
        long i; // Variable declaration for loop delay
        
        Font f = new Font("Times New Roman", Font.BOLD + Font.ITALIC, 14); // Define font
        g.setFont(f); // Set the font for graphics context

        // Display letters of "HAMSIKA" one at a time with animations
        g.setColor(Color.red); 
        g.drawString("H", 500, 300); 
        for (i = 1; i <= 999999999; i++); // Delay
        g.setColor(Color.white); 
        g.drawString("H", 500, 300); 
        for (i = 1; i <= 999999999; i++); // Delay

        g.setColor(Color.orange); 
        g.drawString("A", 500, 300); 
        for (i = 1; i <= 999999999; i++); 
        g.setColor(Color.white); 
        g.drawString("A", 500, 300); 
        for (i = 1; i <= 999999999; i++); 

        g.setColor(Color.black); 
        g.drawString("M", 500, 300); 
        for (i = 1; i <= 999999999; i++); 
        g.setColor(Color.white); 
        g.drawString("M", 500, 300); 
        for (i = 1; i <= 999999999; i++); 

        g.setColor(Color.green); 
        g.drawString("S", 500, 300); 
        for (i = 1; i <= 999999999; i++); 
        g.setColor(Color.white); 
        g.drawString("S", 500, 300); 
        for (i = 1; i <= 999999999; i++); 

        g.setColor(Color.blue); 
        g.drawString("I", 500, 300); 
        for (i = 1; i <= 999999999; i++); 
        g.setColor(Color.white); 
        g.drawString("I", 500, 300); 
        for (i = 1; i <= 999999999; i++); 

        g.setColor(Color.cyan); 
        g.drawString("K", 500, 300); 
        for (i = 1; i <= 999999999; i++); 
        g.setColor(Color.white); 
        g.drawString("K", 500, 300); 
        for (i = 1; i <= 999999999; i++); 

        g.setColor(Color.magenta); 
        g.drawString("A", 500, 300); 
        for (i = 1; i <= 999999999; i++); 
        g.setColor(Color.white); 
        g.drawString("A", 500, 300); 
        for (i = 1; i <= 999999999; i++); 

        // Display letters vertically
        g.setColor(Color.red); 
        g.drawString("H", 500, 300); 
        
        g.setColor(Color.orange); 
        g.drawString("A", 500, 350); 
        
        g.setColor(Color.black); 
        g.drawString("M", 500, 400); 
        
        g.setColor(Color.green); 
        g.drawString("S", 500, 450); 
        
        g.setColor(Color.blue); 
        g.drawString("I", 500, 500); 
        
        g.setColor(Color.cyan); 
        g.drawString("K", 500, 550); 
        
        g.setColor(Color.magenta); 
        g.drawString("A", 500, 600); 
        
        // Display letters horizontally
        g.setColor(Color.orange); 
        g.drawString("A", 550, 300); 
        
        g.setColor(Color.black); 
        g.drawString("M", 600, 300); 
        
        g.setColor(Color.green); 
        g.drawString("S", 650, 300); 
        
        g.setColor(Color.blue); 
        g.drawString("I", 700, 300); 
        
        g.setColor(Color.cyan); 
        g.drawString("K", 750, 300); 
        
        g.setColor(Color.magenta); 
        g.drawString("A", 800, 300); 
    }
}

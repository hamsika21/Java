import java.awt.*;
import java.applet.*;

/*<applet code= A width=1600 height=1600>
</applet>*/

public class A extends Applet
{
public void paint(Graphics g)
{
g.setColor(Color.black);
int a,b,c,d,e,f,l,h,i,j,k,m, y=100;
long n;
m=2;

a=m*180+y;
b=m*120+y;
c=m*40;
d=m*200+y;
e=m*160+y;
f=m*220+y;
l=m*210+y;
h=m*240+y;
i=m*170+y;
j=m*270+y;
k=m*230+y;


// Normal
g.drawLine(d,e,d,f); //body 
g.drawLine(d,a,e,l); //hand
g.drawLine(d,a,h,l);
g.drawLine(d,f,i,j); 
g.drawLine(d,f,k,j);
g.drawOval(a,b,c,c); //head

// Hand motion
for(n=1;n<=999999999;n++);
for(n=1;n<=1999999999;n++);
g.setColor(Color.white);
g.drawLine(d,a,e,l); //hand
g.setColor(Color.black);
g.drawLine(d,a,e,l-140); //hand
Font z= new Font("TimeNewRoman", Font.ITALIC,26);
g.setFont(z);
g.drawString("hi!",e-10,l-150);

// Head motion
for(n=1;n<=999999999;n++);
for(n=1;n<=1999999999;n++);
g.setColor(Color.white);
g.drawOval(a,b,c,c);
g.setColor(Color.black);
g.drawOval(2*a,2*b,c,c); //head

for(n=1;n<=999999999;n++);
for(n=1;n<=999999999;n++);

g.setColor(Color.white);
g.drawOval(2*a,2*b,c,c); //head
g.drawLine(d,e,d,f); //body 
g.drawLine(d,a,e,l); //hand
g.drawLine(d,a,h,l);
g.drawLine(d,f,i,j); 
g.drawLine(d,f,k,j);
g.drawOval(a,b,c,c);
g.drawLine(d,a,e,l-140); //extra hand
g.drawString("hi!",e-10,l-150);

for(n=1;n<=999999999;n++);
for(n=1;n<=999999999;n++);
g.setColor(Color.black);
g.drawOval(2*a,2*b,c,c); //head
g.drawLine(d,e,d,f); //body 
g.drawLine(d,a,e,l); //hand
g.drawLine(d,a,h,l);
g.drawLine(d,f,i,j); 
g.drawLine(d,f,k,j);
g.drawOval(a,b,c,c);
g.fillRect(0,0,2000,2000);

Font w= new Font("TimeNewRoman", Font.BOLD,50);
g.setFont(w);
g.setColor(Color.white);
g.drawString("DIRECTED BY",550,550);
g.drawString("ROBERT B. WEIDE",550,600);

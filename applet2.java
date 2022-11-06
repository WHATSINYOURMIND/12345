import java.applet.*;
import java.awt.*;
public class applet2 extends Applet
{
String a,b;
public void init()
{
a=getParameter("s1");
b=getParameter("s2");
}
public void paint(Graphics g)
{
g.drawString(a,20,30);
g.drawString(b,20,70);
}
}

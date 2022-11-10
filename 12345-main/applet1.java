import java.applet.*;
import java.awt.*;
public class applet1 extends Applet
{
String s;
public void init()
{
s="Hello Applet";
}
public void paint(Graphics g)
{
g.drawString(s,20,30);
}
}

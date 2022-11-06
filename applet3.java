import java.applet.*;
import java.awt.*;
/*<applet code=applet3 width=200 height=300>
</applet>*/
public class applet3 extends Applet
{
public void paint(Graphics g)
{
Font f=new Font("TimesRoman",Font.BOLD|Font.ITALIC,16);
g.setFont(f);
g.drawString("Vidyalankar",10,20);
Color c1=new Color(255,0,0);
g.setColor(c1);
g.fillRect(50,50,60,30);
Color c2=new Color(0,0,200);
g.setColor(c2);
g.fillOval(20,100,50,50);
}
}

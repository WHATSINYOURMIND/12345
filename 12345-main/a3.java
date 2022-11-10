import java.awt.*;
import java.applet.*;
/*<applet  code=a3 width=300 height=300>
</applet>*/
public class a3 extends Applet 
{
public void init()
{
Label l1=new Label("Name");
Label l2=new Label("Password");
Label l3=new Label("Hobbies");
TextField t1=new TextField(10);
TextField t2=new TextField(10);
Checkbox c1=new Checkbox("Singing");
Checkbox c2=new Checkbox("Drawing");
Checkbox c3=new Checkbox("Reading");
Button b=new Button("Submit");

add(l1);
add(t1);
add(l2);
add(t2);
add(l3);
add(c1);
add(c2);
add(c3);
add(b);
}
}




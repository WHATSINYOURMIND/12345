import java.util.*;
class agenegative extends Exception
{
public void display()
{
System.out.println("Age is negative...");
}
}

class exception2
{
public static void main(String x[])
{
try
{
Scanner t=new Scanner(System.in);
System.out.println("Enter name and age=");
String name=t.next();
int age=t.nextInt();
if(age<0)
{
throw new agenegative();
}
else
{
System.out.println("Name="+name+" Age="+age);
}
}
catch(agenegative an)
{
an.display();
}
}
}










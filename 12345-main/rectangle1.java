import java.util.*;
class rectangle
{
int length,breadth;
void accept()
{
Scanner t=new Scanner(System.in);
System.out.println("Enter length and breadth=");
length=t.nextInt();
breadth=t.nextInt();
}
void area()
{
int a=length*breadth;
System.out.println("Area of rectangle="+a);
}
}
class rectangle1
{
public static void main(String x[])
{
rectangle r1=new rectangle();
rectangle r2=new rectangle();
r1.accept();
r1.area();
r2.accept();
r2.area();
}
}









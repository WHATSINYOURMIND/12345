import java.util.*;
class largest
{
public static void main(String args[])
{
Scanner t=new Scanner(System.in);
System.out.println("Enter 3 numbers=");
int a=t.nextInt();
int b=t.nextInt();
int c=t.nextInt();
if(a>b&&a>c)
{
System.out.println("Largest Number="+a);
}
else if(b>c)
{
System.out.println(b+" is largest");
}
else
{
System.out.println(c+" is largest number");
}
}
}
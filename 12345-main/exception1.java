import java.util.*;
class exception1
{
public static void main(String args[])
{
try
{
Scanner t=new Scanner(System.in);
System.out.println("Enter 2 numbers=");
int a=t.nextInt();
int b=t.nextInt();
int c=a/b;
System.out.println("Division="+c);
}
catch(ArithmeticException ae)
{
System.out.println("Arithmetic exception occurs...");
}
catch(InputMismatchException im)
{
System.out.println("Input Mismatch Exception occurs...");
}
}
}

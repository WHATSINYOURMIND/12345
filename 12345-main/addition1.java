import java.util.*;
class number
{
int a,b;
void accept()
{
Scanner t=new Scanner(System.in);
System.out.println("Enter 2 numbers=");
a=t.nextInt();
b=t.nextInt();
}
}
class addition extends number
{
int c;
void add()
{
c=a+b;
System.out.println("Addition="+c);
}
}

class addition1
{
public static void main(String args[])
{
addition ob=new addition();
ob.accept();
ob.add();
}
}
import java.util.*;
class person
{
int id;
String name;
person()
{
Scanner t=new Scanner(System.in);
System.out.println("Enter ID and Name=");
id=t.nextInt();
name=t.next();
}
void display()
{
System.out.println("ID="+id+" Name="+name);
}
}

class account extends person
{
int accno;
account()
{
//super();
Scanner t=new Scanner(System.in);
System.out.println("Enter account number=");
accno=t.nextInt();
}
void display()
{
super.display();
System.out.println("Account Number="+accno);
}
}

class customer extends account
{
double balance;
customer()
{
//super();
Scanner t=new Scanner(System.in);
System.out.println("Enter balance=");
balance=t.nextDouble();
}
void display()
{
super.display();
System.out.println("Balance="+balance);
}
}

class customer1
{
public static void main(String args[])
{
customer c=new customer();
c.display();
}
}

import java.util.*;
class account
{
int accno;
void accept()
{
Scanner t=new Scanner(System.in);
System.out.println("Enter account number=");
accno=t.nextInt();
}
void display()
{
System.out.println("Account Number="+accno);
}
}

interface person
{
int id=100;
void show();
}

class customer extends account implements person
{
double balance;
void accept()
{
super.accept();
Scanner t=new Scanner(System.in);
System.out.println("Enter balance=");
balance=t.nextDouble();
}
void display()
{
super.display();
System.out.println("Balance="+balance);
}
public void show()
{
System.out.println("ID="+id);
}
}

class customer11
{
public static void main(String args[])
{
customer c=new customer();
c.accept();
c.display();
c.show();
}
}






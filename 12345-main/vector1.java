import java.util.*;
class vector1
{
public static void main(String args[])
{
Scanner t=new Scanner(System.in);
Vector v=new Vector();
System.out.println("Enter number of students=");
int n=t.nextInt();
int i;
for(i=0;i<n;i++)
{
System.out.println("Enter student name=");
String s=t.next();
v.addElement(s);
}

while(true)
{
System.out.println("Menu:\n1-Insert Element\n2-Delete Element\n3-Display\n4-Exit\nEnter Choice=");
int ch=t.nextInt();
if(ch==4)
{
break;
}
switch(ch)
{
case 1:
{
System.out.println("Enter name of student and its position=");
String s1=t.next();
int p=t.nextInt();
v.insertElementAt(s1,p);
System.out.println("Record Inserted...");
}
break;
case 2:
{
System.out.println("Enter name of student to be deleted=");
String s2=t.next();
v.removeElement(s2);
System.out.println("Record Deleted...");
}
break;
case 3:
{
for(i=0;i<v.size();i++)
{
System.out.println(v.elementAt(i).toString());
}
}
break;
default:
{
System.out.println("Invalid Choice...");
}
}
}
}
}



class student
{
int roll;
String name;
student(int a,String b)
{
roll=a;
name=b;
}
void display()
{
System.out.println("Roll Number="+roll+" Name="+name);
}
}
class test extends student
{
int m1,m2;
test(int a,String b,int c,int d)
{
super(a,b);
m1=c;
m2=d;
}
void display()
{
super.display();
System.out.println("Marks1="+m1+" Marks2="+m2);
}
}
class sports extends student
{
int score;
sports(int a,String b,int c)
{
super(a,b);
score=c;
}
void display()
{
super.display();
System.out.println("Score="+score);
}
}

class student1
{
public static void main(String args[])
{
test t=new test(1,"SSS",80,90);
t.display();
sports s=new sports(2,"AAA",90);
s.display();
}
}






class complex
{
int x,y;
void accept(int a,int b)
{
x=a;
y=b;
}
void display()
{
System.out.println(x+"+i"+y);
}
void add(complex p,complex q)
{
x=p.x+q.x;
y=p.y+q.y;
}
}
class complex1
{
public static void main(String args[])
{
complex c1,c2,c3;
c1=new complex();
c2=new complex();
c3=new complex();
c1.accept(2,3);
c1.display();
c2.accept(4,5);
c2.display();
c3.add(c1,c2);
System.out.println("Addition=");
c3.display();
}
}










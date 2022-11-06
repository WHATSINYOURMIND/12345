class complex
{
int x,y;
complex()
{
x=0;
y=0;
}
complex(int x,int y)
{
this.x=x;
this.y=y;
}
void display()
{
System.out.println(x+"+i"+y);
}
complex add(complex p)
{
complex temp=new complex();
temp.x=x+p.x;
temp.y=y+p.y;
return temp;
}
}
class complex2
{
public static void main(String args[])
{
complex c1=new complex(2,3);
complex c2=new complex(4,5);
complex c3=new complex();
c1.display();
c2.display();
c3=c1.add(c2);
System.out.println("Addition=");
c3.display();
}
}










class A extends Thread
{
public void run()
{
int i;
for(i=2;i<=20;i=i+2)
{
System.out.println("Even Number="+i);
}
}
}

class B extends Thread
{
public void run()
{
int i;
for(i=1;i<=20;i=i+2)
{
System.out.println("Odd Number="+i);
}
}
}

class thread1
{
public static void main(String args[])throws InterruptedException
{
A a=new A();
B b=new B();
a.start();
b.start();
a.join();
b.join();
System.out.println("End...");
}
}
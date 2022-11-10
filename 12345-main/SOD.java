import java.util.*;
class SOD
{
public static void main(String args[])
{
Scanner t=new Scanner(System.in);
System.out.println("Enter a number=");
int n=t.nextInt();
int d,sum=0;
while(n!=0)
{
d=n%10;
sum=sum+d;
n=n/10;
}
System.out.println("Sum of digits="+sum);
}
}
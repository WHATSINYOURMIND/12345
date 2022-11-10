import java.util.*;
class palindrome
{
public static void main(String x[])
{
Scanner t=new Scanner(System.in);
System.out.println("Enter String=");
String s1=t.next();
String s2=reverse(s1);
if(s1.equals(s2))
{
System.out.println("Palindrome String");
}
else
{
System.out.println("Non Palindrome String");
}
}



static String reverse(String s1)
{
char x[]=s1.toCharArray();//String to character array
int i,j;
i=0;
j=x.length-1;
char temp;
while(i<j)
{
temp=x[i];
x[i]=x[j];
x[j]=temp;
i++;
j--;
}
String p=new String(x);//Character array to string
return p;
}
}







import java.util.*;
public class Armstrong
{
 public static void main(String[] args)
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a number-");
  int n= sc.nextInt();
  int temp=n,result=0;
  int rem=1;
  while(temp!=0)
  {
    rem=temp%10;
	result= result+ rem*rem*rem;
    temp= temp/10;
  }
  if(result==n)
  {
	  System.out.println("The number "+n+" is an armstrong number");
  }
  else
  {
	System.out.println("The number "+n+" is not an armstrong number");  
  }
}
}

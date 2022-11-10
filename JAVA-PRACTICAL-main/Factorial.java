//factorial f number in java
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the number:");
    int n=sc.nextInt();
    int fact=1;
    for(int i=1;i<=n;i++)
    {
        fact=fact*i;
    }
    System.out.println("Factorial of the number is: "+fact);
  }  
}


import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
	    int n=sc.nextInt();
	    int rem,sum=0;
	    int x=n;
	    while(n!=0){
	    rem=n%10;
	    sum= sum +(rem*rem*rem);
	    n=n/10;
	    }
	    if(x==sum){
		System.out.println("The number is a Armstrong number.");
	}
	else{
	   System.out.println("The number is NOT  a Armstrong number.");
	}
}
}


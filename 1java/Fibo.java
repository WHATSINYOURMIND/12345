import java.util.*;
import java.util.Scanner;
public class Fibo{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of elements to be printed of fibonnaci series");
		int n = sc.nextInt();
		int c;
		int i,a=0,b=1;
		System.out.println("The fibonnaci series is:");
		System.out.print(a+" "+b+" ");
			for(i=2;i<n;i++){
				c=a+b;
				System.out.print(c+" ");
				a=b;
				b=c;
			}
		}
	}

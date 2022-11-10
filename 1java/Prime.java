import java.util.*;
import java.util.Scanner;
public class Prime{
public static void main(String[] args){
System.out.println("Enter the number to check if its Prime");
                   Scanner sc = new Scanner(System.in);
			       int c=sc.nextInt(); 
				   int count=0;
				   int z;
		           for(int i=1;i<=c;i++){
		           z=c/i;
				   if(z!=0){
			       count++;
		           }
		           }
		           if(count>2){
			       System.out.println("The number is not prime");
		           }
		           else{
			       System.out.println("The number is prime");
		           }
				   }
				   }

import java.util.*;
import java.util.Scanner;
public class Racer{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("What is the speed of racer 1:");
	int r1= sc.nextInt();
	System.out.println("What is the speed of racer 2:");
	int r2= sc.nextInt();
	System.out.println("What is the speed of racer 3:");
	int r3= sc.nextInt();
	System.out.println("What is the speed of racer 4:");
	int r4= sc.nextInt();
	System.out.println("What is the speed of racer 5:");
	int r5= sc.nextInt();
	float avg=(r1+r2+r3+r4+r5)/5;
	System.out.println("To qualify for the race the speed of racer has to be greater than : "+avg);
	if(avg<r1){
		System.out.println("Racer 1 qualified");
	}
	else{
		System.out.println("Racer 1 didnt qualify");
	}
	if(avg<r2){
		System.out.println("Racer 2 qualified");
	}
	else{
		System.out.println("Racer 2 didnt qualify");
	}
	if(avg<r3){
		System.out.println("Racer 3 qualified");
	}
	else{
		System.out.println("Racer 3 didnt qualify");
	}
    if(avg<r4){
		System.out.println("Racer 4 qualified");
	}
	else{
		System.out.println("Racer 4 didnt qualify");
	}
	if(avg<r5){
		System.out.println("Racer 5 qualified");
	}
	else{
		System.out.println("Racer 5 didnt qualify");
	}
}
}

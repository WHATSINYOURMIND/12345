import java.util.*;
import java.util.Scanner;
public class Salary{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		String empname= sc.nextLine();
		System.out.println("Enter you employee number:");
		int empno = sc.nextInt();
		System.out.println("Enter your basic salary:");
		int basic = sc.nextInt();
		int DA = 70*basic/100;
		System.out.println("Your DA is: "+DA);
		int HRA = 30*basic/100;
		System.out.println("Your HRA is: "+HRA);
		int CCA= 240;
		System.out.println("Your CCA is: "+CCA);
		int Pf=10*basic/100;
		System.out.println("Your Pf is: "+Pf);
		int PT=100;
		System.out.println("Your PT is: "+PT);
		int gross=basic+HRA+CCA+DA;
		System.out.println("Your Gross Salary is: "+gross);
		int net=gross-Pf-PT;
		System.out.println("Your Net Salary is: "+net);
	}
}

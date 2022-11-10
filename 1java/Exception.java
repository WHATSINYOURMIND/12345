import java.util.*;
public class EH{
public static void main(String[] args){
 int a=10,b=0;
  try{
	  int c=a/b;
	 System.out.println("The answer is "+c);
 }
 catch(Exception e){
	 System.out.println(e);
 }
 finally {
	 System.out.println("Rest of the program");
 }
}
}

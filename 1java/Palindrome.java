import java.util.*;
public class Palindrome{
public static void main(String[] args){
    System.out.println("Enter a string to check if palindrome:");
	Scanner sc = new Scanner(System.in);
	String word= sc.nextLine();
    String reverse="";
    int wordlength= word.length();	
	for(int i= wordlength-1;i>=0;--i){
		reverse = reverse + word.charAt(i);
    }

    if (word.toLowerCase().equals(reverse.toLowerCase())) {
      System.out.println(word+ " is a Palindrome String.");
    }
	else{
		System.out.println(word+ " is not a Palindrome String.");
	}
}
}

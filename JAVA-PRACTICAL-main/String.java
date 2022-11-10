import java.util.*;
import java.lang.String;

public class Main{
    public static void main(String args[]){
      strings s1 = new strings();
    }
}


class strings{
    strings(){
        String str1 = "Shagun"; 
        char arr[] = {'G','u','p','t','a'}; 
        String str2 = new String(arr); //Converting char array to a string.
        System.out.println("String1:>"+str1);
        System.out.println("String2:>"+str2);
        System.out.println("Length of string1: " + str1.length()+"\n");

        int comp = str1.compareTo(str2);//comparing two string
        if(comp == 0){
           System.out.println("Strings are equal \n"); 
        }
        else if(comp > 0){
            System.out.println("str1 has more characters than str2\n"); 
        }
        else{
            System.out.println("str1 has less characters than str2\n"); 
        }

        System.out.println("Concated string :"+str1.concat(str2)+"\n");
        System.out.println("Returning 1st three character of string1:"+str1.substring(0,3)+"\n"); 
        System.out.println("Returning 1st four character of string2:"+str2.substring(0,4)+"\n"); 
        
    }
}
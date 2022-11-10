import java.util.*;
public class Array{
public static void main(String[] args){
int i;
          Scanner sc = new Scanner(System.in);
         System.out.println("Enter the length of the array:");
           int len= sc.nextInt();
          int[] arr=new int[len];
         System.out.println("Enter the elements of the array:");
            for(i=0;i<len;i++){
          arr [i]=sc.nextInt();
       }
        System.out.println("the array is :");
           display(arr,len);
}
public static void display(int arr1[],int len){
         int i;
        for(i=0; i<len; i++)
            {
                System.out.print(arr1[i]+" ");
}
}
}

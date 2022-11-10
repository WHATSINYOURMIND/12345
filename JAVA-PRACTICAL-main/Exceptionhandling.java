//Arithmetic Exceptions

public class Main
{
    public static void main (String []arg)
{
    try {
        int data=100/0;
    }
    catch(ArithmeticException e)
    {
    System.out.println(e);
    }
    //rest of the Code

    System.out.println("rest of the code....");
}
}

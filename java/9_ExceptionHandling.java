public class 9_ExceptionHandling{
	public static void main(String [] args){
		try{
		int a=40/0;
		System.out.println(a);
		}
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println("rest of the code");
	}
}

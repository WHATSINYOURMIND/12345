import java.util.*;
class number extends Thread{
	public void run(){
  for(int i=1;i<27;i++){
  try{
  Thread.sleep(100);
  }
  catch(Exception e){
  System.out.print(e);
  }
   System.out.print(i+" ");
 }
}
}
class letter implements Runnable{
	public void run(){
	for(char i='A'; i<='Z';i++){
		try{
			Thread.sleep(120);
		}
		catch(Exception e){
          System.out.print(e);
      }
    System.out.print(i+" ");
	}
	}
}
public class Multi{
	public static void main(String[] args){
		number obj1 = new number();
		letter obj2 = new letter();
		Thread t1 = new Thread(obj2);
		obj1.start();
		t1.start();
	}
}

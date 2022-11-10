import java.util.*;
import java.io.*;
interface A{
  void a();
  void b();
  void c();
  void d();
}
class Int1 implements A{
  public void a(){System.out.println("I am a");}
  public void b(){System.out.println("I am b");}
  public void c(){System.out.println("I am c");}
  public void d(){System.out.println("I am d");}
}
class M{
	public static void main (String[] args){
		A o = new Int1();
		o.a();o.b();o.c();o.d();
	}
}

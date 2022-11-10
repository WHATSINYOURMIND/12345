import java.util.*;
public class shape{
double h;
double w;
double d;}
 class shapedemo{
 public static void main(String[] args){
 shape rect = new shape();
 shape square = new shape();
 shape cube = new shape();
 shape tri = new shape();
 double peri;
 rect.h=10;
 rect.w=20;
 square.h=30;
 cube.h=40;
 tri.h=45;
 tri.w=50;
 tri.d=55;
 peri=(rect.h+rect.w)*2;
 System.out.println("Perimeter of rectangle is "+peri);
 peri=4*square.h;
 System.out.println("Perimeter of square is "+peri);
 peri =cube.h*12;
 System.out.println("Perimeter of cube is "+peri);
 peri=tri.h+tri.w+tri.d;
 System.out.println("Perimeter of triangle is "+peri);
 }
}

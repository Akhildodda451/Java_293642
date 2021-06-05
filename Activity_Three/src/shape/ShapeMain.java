package shape;
import java.util.Scanner;

abstract class Shape
{
 abstract void area(int value);
 int value;
public int getValue() 
{
	return value;
}
public void setValue(int value) 
{
	this.value = value;
}

}


class Circle extends Shape
{
 

 public void area(int value)
 {
     int r = value;
  double area = (double) (Math.PI * r * r);
  System.out.println("Area of Circle is: "+area);
 }
}
class Square extends Shape
{
 
 public void area(int value)
 {
     int r = value;
 double area =  (double) (r * r);
  System.out.println("Area of Sqaure is: "+area);
 }
}
 
public class ShapeMain {

  
    public static void main(String[] args) {
   
  

  System.out.println("Circle");
  System.out.println("Square");
  
  System.out.println("Enter Shape");
  Scanner get=new Scanner(System.in);
  String a=get.nextLine();
 
  
 
   if("Circle".equals(a))
  {
      System.out.println("Enter the radius");
       int value = get.nextInt();
    
       Circle c=new Circle();
         c.area(value);   
  }
  else
  {
          Square s=new Square(); 
          System.out.println("Enter the side");

          int value = get.nextInt();
      s.area(value);
  }
  
    }
    
}
//read 4 objects out of which 3 objects would be initialised.
//jp to implement a class triangle with atrributes as the three sides and member methods to read the sides and display the area of triangle.
import java.util.*;
class Triangle
{
	Scanner scan=new Scanner(System.in)
	double area;
	Triangle(double a)
	{
		System.out.println("enter side :");
		a=scan.nextDouble();
		area=0.433*a*a;
		
		
	}
	Triangle(double a, double b)
	{
		System.out.println("enter two different side values:");
		a=scan.nextDouble();
		b=scan.nextDouble();
		double s= (a+a+b)/2;
		double t= s*(s-a)*(s-a)*(s-b);
		 area= Math.sqrt(t);
		 
	}
	Triangle(double a, double b, double c)
	{
		System.out.println("enter three different sides:");
		a=scan.nextdouble();
		b=scan.nextDouble();
		c=scan.nextDouble();
		double s= (a+b+c)/2;
		double x= s*(s-a)*(s-b)*(s-c);
		area= Math.sqrt(x);
	}
}
class Demo
{
	public static void main(String args[])
	double a,b,c;
		Triangle  obj1 = new Triangle(a);
		Triangle obj2= new Triangle(a,b);
		Triangle obj3= new Triangle(a,b,c);
		System.out.println("area is :" +area);
	}

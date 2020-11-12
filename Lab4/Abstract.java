import java.io.*;
import java.lang.*;
import java.util.*;
abstract class Shape{
	int len,wid;

	Shape(int l,int w)
	{
		len=l;
		wid=w;
	}
	abstract void printArea();
}


class Rectangle extends Shape
{
	Rectangle(int a,int b)
	{
		super(a,b);
	}

	void printArea()
	{
		System.out.println("Area Of Rectangle is " + (len*wid));
	}

}

class Triangle extends Shape
{
	Triangle(int a,int b)
	{
		super(a,b);
	}

	void printArea()
	{
		System.out.println("Area Of The Traingle Is " + ((len*wid)/2));
	}
}

class Circle extends Shape
{
	Circle(int r1,int r2)
	{
		super(r1,r2);
	}
	void printArea()
	{
	    System.out.println("Area Of the Circle is " + (3.142*len*len));
	}
}

class Abstract
{
	public static void main(String[] args)
	{
		int l,b,rad;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length/base of the rectangle/Traingle respectively ");
		l=sc.nextInt();
		System.out.println("Enter the breadth/height of the rectangle/Triangle respectively ");
		b=sc.nextInt();
		System.out.println("Enter the radius of the circle ");
		rad=sc.nextInt();
		Shape s;
		Rectangle r=new Rectangle(l,b);
		Triangle t=new Triangle(l,b);
		Circle c=new Circle(rad,rad);
		s=r;
    	s.printArea(); //prints the area of the rectangle
		s=t;
		s.printArea(); //prints the area of the triangle 
		s=c;
		s.printArea(); //prints the area of the circle
	}
}

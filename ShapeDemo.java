/*
Create a base class called Shape. Use this class to store two double type values (dim1 and
dim2) that could be used to compute the area of figures. Derive two specific classes called
Triangle and Rectangle from the base class Shape. Add to the base class, a method
get_data() to initialize base class data members and another method display_area() to
compute and display the area of figures. Override this method in the derived classes to suit
their requirements.
Using these three classes, design a program that will accept dimensions of a triangle or
rectangle using command line argument and display the area. The two values given by the
user will be treated as lengths of two sides in the case of rectangle and as base and height in
the case of triangles*/
abstract class Shape
{
	double dim1, dim2;
	abstract void get_data(double d1, double d2);
	abstract void display_area();
}
class Triangle extends Shape
{
	void get_data(double d1, double d2)
	{
		dim1=d1;
		dim2=d2;
	}
	void display_area()
	{
		System.out.println("Area is Triangle is "+(0.5*dim1*dim2));
	}
}
class Rectangle extends Shape
{
	void get_data(double d1, double d2)
	{
		dim1=d1;
		dim2=d2;
	}
	void display_area()
	{
		System.out.println("Area is Rectangle is "+(dim1*dim2));
	}
}
class ShapeDemo
{
	public static void main(String [] args)
	{
		if(args.length != 2)
		{
			System.out.println("Usage: java ShapeDemo <dim1> <dim2>");
			System.exit(1);
		}

		Triangle t = new Triangle();
		t.get_data(Double.parseDouble(args[0]),Double.parseDouble(args[1]));
		t.display_area();
		Rectangle r = new Rectangle();
		r.get_data(Double.parseDouble(args[0]),Double.parseDouble(args[1]));
		r.display_area();
	}
}

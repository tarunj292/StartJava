/*Create an interface Figure with field PI for storing the value of PI and declare three methods:
(i) For finding area
(ii) For finding perimeter
(iii) For displaying the dimensions of a figure
Create two classes: Rectangle and Circle, that implement this interface.
In another class (FigureDemo), write main method to test Rectangle and Circle class.*/

interface Figure
{
	double PI = 3.14;
	double area();
	double perimeter();
	void getDimensions();
}
class Rectangle implements Figure
{
	private double length, width;
	public Rectangle(double length, double width)
	{
		this.length = length;
		this.width = width;
	}
	public double area()
	{
		return length*width;
	}
	public double perimeter()
	{
		return 2*(length+width);
	}
	public void getDimensions()
	{
		System.out.println("Rectangle: Length = " + length + ", Width = " + width);
	}
}
class Circle implements Figure
{
	private double radius;
	Circle(double radius)
	{
		this.radius = radius;
	}
	public double area()
	{
		return PI*radius*radius;
	}
	public double perimeter()
	{
		return 2*PI*radius;
	}
	public void getDimensions()
	{
		System.out.println("Circle: Radius = " + radius);
	}
}
class FigureDemo
{
	public static void main(String [] args)
	{
		Rectangle r = new Rectangle(5.0,5.0);
		System.out.println(r.area()+"\n "+r.perimeter());
		r.getDimensions();
		Circle c = new Circle(10.0);
		System.out.println(c.area()+"\n "+c.perimeter());
		c.getDimensions();
	}
}
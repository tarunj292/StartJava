//Create a class Circle. Add a constant for storing the value of PI. Add an instance variable for
//storing the radius. Add appropriate constructor(s) and methods for calculating the area and
//circumference of the circle
class Circle
{
	final double PI = 3.14;
	int radius;
	Circle(int radius)
	{
		this.radius = radius;
	}
	
	double circumference()
	{
		return 2*PI*radius;
	}
	
	double area()
	{
		return PI*radius*radius;
	}
}

class CircleDemo
{
	public static void main(String [] args)
	{
		Circle c = new Circle(5);
		System.out.println(c.circumference());
		System.out.println(c.area());
	}
}
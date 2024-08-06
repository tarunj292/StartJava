/*Create a class Box with instance variables for storing height, width and depth of a box. Write constructors as follows: (i) Default constructor (ii) Parameterized constructor with values of height, width and depth given as parameter (iii) Parameterized constructor for creating a cube (iv) Parameterized constructor for creating a copy of the Box object Add a method for calculating the volume of the Box. From the Box class inherit a class WeightBox. Add the instance variable weight to the class. Write appropriate constructors. Create another class BoxDemo to write main method to create objects of WeightBox class and calculate its volume of the box.*/
class Box
{
	double h,w,d;
	Box()
	{
		h=w=d=0;
	}
	Box(double h, double w, double d)
	{
		this.h=h;
		this.w=w;
		this.d=d;
	}
	Box(double l)
	{
		h=w=d=l;
	}
	Box(Box b)
	{
		h=b.h;
		w=b.w;
		d=b.d;
	}
	double volume()
	{
		return h*w*d;
	}
}
class WeightBox extends Box
{
	double weight;
	WeightBox(double weight, double h, double w, double d)
	{
		super(h,w,d);
		this.weight=weight;
	}
	WeightBox(double weight, double l)
	{
		super(l);
		this.weight = weight;
	}
}
class BoxDemo
{
	public static void main(String [] args)
	{
		WeightBox wb = new WeightBox(30,6,6,6);
		WeightBox wb2 = new WeightBox(23,3);
		System.out.println("Volume is "+wb.volume()+"\nVolume of Cube is "+wb2.volume());
	}
}
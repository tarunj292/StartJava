class Student
{
	int roll;
	Student(int rno)
	{
		roll = rno;
	}
	void getRoll()
	{
		System.out.println("Roll number is "+roll);
	}
}
class Test extends Student
{
	float part1, part2;
	Test(int roll, float p1, float p2)
	{
		super(roll);
		part1 = p1;
		part2 = p2;
	}
	void getMarks()
	{
		System.out.println("Internal Marks = "+part1+"\nExternal marks = "+part2);
	}
}
interface Sports
{
	float sportswt = 0.64f;
	void getwt();
}
class Result extends Test implements Sports
{
	Result(int roll, float p1, float p2)
	{
		super(roll, p1, p2);
	}
	void display()
	{
		System.out.println("Sports weight: "+ sportswt +"\nTotal Marks: "+ (part1+part2));
	}
	public void getwt()
	{
		System.out.println("Sports weight: "+ sportswt);
	}
}
class StudentDemo
{
	public static void main(String [] args)
	{
		Result r = new Result(36, 60, 99);
		r.getRoll();
		r.getMarks();
		r.getwt();
		r.display();
	}
}
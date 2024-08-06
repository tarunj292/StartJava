class Student
{
	int roll;
	String name;
	double[] marks = new double[5];
	Student(int roll, String name, double[] marks)
	{
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	String Grade()
	{
		double sum = 0;
		String Grade = "";
		for(double x : this.marks)
			sum+=x;
		double avg = sum/this.marks.length;
		System.out.println(avg);
		if (avg<=100 && avg>=80)
			Grade = "Distinction";
		else if (avg<=79 && avg>=60)
			Grade = "First Division";
		else if (avg<=69 && avg>=50)
			Grade = "Second Division";
		else if (avg<49 && avg>=40)
			Grade = "Third Division";
		else if (avg<=39 && avg>=0)
			Grade = "Fail";
		return Grade;
	}
}
class Result
{
	public static void main(String [] args)
	{
		Student s1 = new Student(36, "Tarun", new double[]{55,56,57,58,59});
		System.out.println(s1.Grade());
	}
}
/*Define a Time class containing the following members:
• Two integer fields minutes and hours
• Two overloaded constructors
• One method to display the class fields
• increment() method that increments time by 1 minute
• decrement() method that decrements time by 1 minute
Properties for minutes and hours should ensure that only valid values of minutes and hours
are set. One of the constructors take two integer parameters to assign values to data
members and the other constructor takes one integer parameter representing total number
of minutes and converts it into hours and minutes. Write the complete program to test the
methods.*/
class Time
{
	int minutes, hours;
	Time(int minutes, int hours)
	{
		this.minutes = minutes%60;
		this.hours = minutes/60+hours;
	}
	Time(int minutes)
	{
		this.hours  = minutes/60;
		this.minutes = minutes%60;
	}
	void getTime()
	{
		System.out.println(hours+":"+minutes);
	}
	void increment()
	{
		minutes++;
		if (minutes == 60)
		{
			minutes = 0;
			hours++;
		}
	}
	void decrement()
	{
		minutes--;
		if (minutes == -1)
		{
			minutes = 0;
			hours--;
		}
	}
}
class TimeDemo
{
	public static void main(String [] args)
	{
		Time t = new Time(11,5);//minute,hour
		t.getTime();
		t.increment();
		t.decrement();
	}
}
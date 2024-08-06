class Celsius
{
	double temp = 0.0;
	Celsius(double temp)
	{
		this.temp = temp;
	}
	double ToFahrenheit()
	{
		return temp*9/5+32;
	}
	void display()
	{
		System.out.println("Temperatur in Celsius: " + temp + "\nTemperature in Fahrenheit: " + ToFahrenheit());
	}
}
class ConvertTemp
{
	public static void main(String [] args)
	{
		Celsius c = new Celsius(1);
		c.ToFahrenheit();
		c.display();
	}
}
class Complex
{
	double real, imaginary;
	Complex()
	{
		real = 0.0;
		imaginary = 0.0;
	}
	Complex(double real, double imaginary)
	{
		this.real = real;
		this.imaginary = imaginary;
	}
	Complex add(Complex o)
	{
		Complex r = new Complex();
		r.real = real + o.real;
		r.imaginary = imaginary + o.imaginary;
		return r;
	}
	Complex multiply(Complex o)
	{
		Complex r = new Complex();
		r.real = (real * o.real) - (imaginary * o.imaginary);
		r.imaginary = (real * o.imaginary) + (imaginary * o.real);
		return r;
	}
	void display()
	{
		System.out.println(real + " + " + imaginary + "i");
	}
}
class ComplexDemo
{
    public static void main(String[] args) {
        Complex num1 = new Complex(3.0, 4.0); // 3 + 4i
        Complex num2 = new Complex(1.0, -2.0); // 1 - 2i

        Complex sum = num1.add(num2);
        Complex product = num1.multiply(num2);

        System.out.println("Complex Number 1: ");
        num1.display();

        System.out.println("Complex Number 2: ");
        num2.display();

        System.out.println("Sum of Complex Numbers: ");
        sum.display();

        System.out.println("Product of Complex Numbers: ");
        product.display();
    }
}

/*Create a class MathOperation that has various static methods for providing basic mathematical operations like addition, multiplication, division, subtraction, a to the power b, absolute value etc., without using any library functions. Write a class MathApplication that has a main method. Allow the user to give three inputs: two numbers and the operation to be performed. The program should then call the appropriate method of MathOperation to determine the result.*/
import java.util.Scanner;
class MathOperation
{
	static double Add(double n1, double n2)
	{
		return (n1+n2);
	}
	static double Mul(double n1, double n2)
	{
		return (n1*n2);
	}
	static double Div(double n1, double n2)
	{
		if (n2 == 0)
		{
			System.out.println("Division by zero is not allowed.");
			return Double.NaN;
        	}
        	return (n1/n2);
	}
	static double Sub(double n1, double n2)
	{
		return (n1-n2);
	}
	static double pow(double n1, double n2)
	{
		double res = 1;
		for(int i=0; i<n2; i++)
			res=res*n1;
		if(n2<0)
			return 1/res;
		return res;
	}
	static double abs(double n1)
	{
		if(n1<0)
			return -n1;
		return n1;
	}
}
class MathApplication
{
	public static void main(String [] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter first number:");
		double n1 = scn.nextDouble();
		System.out.println("Enter second number:");
		double n2 = scn.nextDouble();
		System.out.println("Enter:\n 1: Addition\n 2: Subtraction\n 3: Multiplication\n 4: Division\n 5: Power\n 6: Absolute Value");
		int choice = scn.nextInt();
		double result=0;
		switch(choice)
		{
			case 1:
				result =  MathOperation.Add(n1,n2);
				break;
			case 2:
				result =  MathOperation.Sub(n1,n2);
				break;
			case 3:
				result =  MathOperation.Mul(n1,n2);
				break;
			case 4:
				result =  MathOperation.Div(n1,n2);
				break;
			case 5:
				result =  MathOperation.pow(n1,n2);
				break;
			case 6:
				result =  MathOperation.abs(n1);
				break;
			default:
				System.out.println("Enter a valid Input");
		}
		System.out.println("Result is "+result);
	} 
}
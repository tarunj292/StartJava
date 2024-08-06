import java.util.Stack;
public class InfixEval
{
	public static void main(String [] args)
	{
		Stack<Integer> opnds = new Stack<>();
		Stack<Character> optors = new Stack<>();
		String exp = "2+(5-3*6/2)+(7/7*7-7)";
		for(int i = 0; i<exp.length(); i++)
		{
			char ch = exp.charAt(i);
			if(Character.isDigit(ch))
			{
				opnds.push(ch - '0');
			}
			else if(ch == '(')
			{
				optors.push('(');
			}
			else if(ch == ')')
			{
				while(optors.peek() !='(')
				{
					int n1 = opnds.pop();
					int n2 = opnds.pop();
					char op = optors.pop();
					int ans = Calculate(n1,n2,op);
					opnds.push(ans);
				}
				optors.pop();
			}
			else if(ch == '+' || ch == '-' || ch == '*' || ch == '/')
			{
				while(optors.size()>0 && optors.peek() != '(' && precedence(ch) <= precedence(optors.peek()))
				{
					int n1 = opnds.pop();
					int n2 = opnds.pop();
					char op = optors.pop();
					int ans = Calculate(n1,n2,op);
					opnds.push(ans);
				}
				optors.push(ch);
			}
		}
		while(!optors.isEmpty())
		{
			int n1 = opnds.pop();
			int n2 = opnds.pop();
			char op = optors.pop();
			int ans = Calculate(n1,n2,op);
			opnds.push(ans);
		}
		System.out.println(opnds +" "+ optors);
	}
	public static int precedence(char op)
	{
		if(op == '+'){return 1;}
		else if(op == '-'){return 1;}
		else if(op == '*'){return 2;}
		else if(op == '/'){return 2;}
return 0;
	}
	public static int Calculate(int n1, int n2, char op)
	{
		if(op == '+'){return n2+n1;}
		else if(op == '-'){return n2-n1;}
		else if(op == '*'){return n2*n1;}
		else if(op == '/'){return n2/n1;}
return 0;
	}
}
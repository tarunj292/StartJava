import java.util.Stack;
public class InfixConvert
{
	public static void main(String [] args)
	{
		Stack<String> pre = new Stack<>();
		Stack<String> post = new Stack<>();
		Stack<Character> operator = new Stack<>();
		String exp = "2+(5-3*6/2)+(7/7*7-7)";
		for(int i = 0; i<exp.length(); i++)
		{
			char ch = exp.charAt(i);
			if(Character.isDigit(ch))
			{
				pre.push(ch - '0');
				post.push(ch - '0');
			}
			else if(ch == '(')
			{
				operator.push('(');
			}
			else if(ch == ')')
			{
				while(operator.peek() !='(')
				{
					String n1 = pre.pop();
					String n2 = pre.pop();
					String ans = operator.pop() + n1 + n2;
					pre.push(ans);
					n1 = post.pop();
					n2 = post.pop();
					ans = n1 + n2 + operator.pop();
					post.push(ans);
				}
				operator.pop();
			}
			else if(ch == '+' || ch == '-' || ch == '*' || ch == '/')
			{
				while(operator.size()>0 && operator.peek() != '(' && precedence(ch) <= precedence(operator.peek()))
				{
					String n1 = pre.pop();
					String n2 = pre.pop();
					String ans = operator.pop() + n1 + n2;
					pre.push(ans);
					n1 = post.pop();
					n2 = post.pop();
					ans = n1 + n2 + operator.pop();
					post.push(ans);
				}
				operator.push(ch);
			}
		}
		while(!operator.isEmpty())
		{
			int n1 = pre.pop();
					n1 = pre.pop();
					n2 = pre.pop();
					ans = operator.pop() + n1 + n2;
					pre.push(ans);
					n1 = post.pop();
					n2 = post.pop();
					ans = n1 + n2 + operator.pop();
					post.push(ans);
		System.out.println(post + " " + pre +" "+ operator);
		}
	}
	public static int precedence(char op)
	{
		if(op == '+'){return 1;}
		else if(op == '-'){return 1;}
		else if(op == '*'){return 2;}
		else if(op == '/'){return 2;}
		return 0;
	}
}
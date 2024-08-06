import java.util.Stack;
public class NextGreaterElementOnRight
{
	public static void main(String [] args)
	{
		int arr[] = new int[]{2,5,9,3,1,12,6,8,7};
		Stack<Integer> st = new Stack<>();
		Stack<Integer> ans = new Stack<>();
		for(int i = arr.length-1; i>=0; i--)
		{
			int num = arr[i];
			if(st.isEmpty())
			{
				ans.push(-1);
				st.push(num);
			}
			else
			{
				while(!st.isEmpty() && num > st.peek())
				{
					st.pop();
				}
				if(st.isEmpty())
				{
					ans.push(-1);
				}
				else
				{
					ans.push(st.peek());
				}
				st.push(num);
			}

		}
		System.out.println(ans);		
	}
}
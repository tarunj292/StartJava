import java.util.Stack;

public class NextGreaterElementOnRight2
{
	public static void main(String args[])
	{
		int arr[] = new int[]{2,5,9,3,1,12,6,8,7};
		Stack<Integer> st = new Stack<>();
		int nge[] = new int[arr.length];
		st.push(0);
		for(int i = 1; i<arr.length; i++)
		{
			if(st.size() == 0)
			{
				st.push(i);
			}
			else
			{
				while(st.size() > 0 && arr[st.peek()] < arr[i])
				{
					nge[st.peek()] = arr[i];
					st.pop();
				} 
				st.push(i);
			}
		}
		while(st.size() != 0)
		{
			nge[st.peek()] = -1;
			st.pop();
		}
		for(int i : nge)
		{
			System.out.println(i);
		}
	}
}
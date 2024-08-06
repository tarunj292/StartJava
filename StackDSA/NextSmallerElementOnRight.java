import java.util.Stack;

public class NextSmallerElementOnRight
{
	public static void main(String [] args)
	{
		int arr[] = new int[]{1,2,3,4,};
		Stack<Integer> st = new Stack<>();
		int nse[] = new int[arr.length];
		st.push(0);
		for(int i = 1; i<arr.length; i++)
		{
			while(st.size()>0 && arr[i]<arr[st.peek()])
			{
				nse[st.peek()] = arr[i];
				st.pop();
				
			}
			st.push(i);
		}
		while(st.size() != 0)
		{
			nse[st.peek()] = -1;
			st.pop();
		}
		for(int i : nse){System.out.println(i);}
	}
}
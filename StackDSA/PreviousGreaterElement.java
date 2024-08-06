import java.util.Stack;
public class PreviousGreaterElement
{
	public static void main(String [] args)
	{
		int arr[] = new int[]{2,5,9,3,1,12,6,8,7};
		Stack<Integer> st = new Stack<>();
		int pge[] = new int[arr.length];
		st.push(0);
		pge[0] = -1;
		for(int i=1; i<arr.length; i++)
		{
			while(st.size() > 0 && st.peek() <= arr[i])
			{
				st.pop();
			}
			if(st.size() > 0)
			{
				pge[i] = st.peek();
			}
			else
			{
				pge[i] = -1;
			}
			st.push(arr[i]);
		}
		for(int i: pge)
		{System.out.println(i);}
	}
}
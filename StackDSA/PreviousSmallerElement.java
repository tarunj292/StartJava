import java.util.Stack;
public class PreviousSmallerElement
{
	public static void main(String [] args)
	{
		int arr[] = new int[]{4,10,5,8,20,15,3,12};
		Stack<Integer> st = new Stack<>();
		int pse[] = new int[arr.length];
		for(int i = 0; i<arr.length; i++)
		{
			while(st.size() > 0 && arr[i] < arr[st.peek()])
			{
				st.pop();
			}
			if(st.isEmpty())
			{
				pse[i] = -1;
			}
			else
			{
				pse[i] = st.peek();
			}
			st.push(i);
		}
		for(int n: pse)
		{
			System.out.println(n);
		}
	}
}
import java.util.Stack;
public class Span
{
	public static void main(String [] args)
	{
		int arr[] = new int[]{6,2,5,0,4,5,1,6};
		Stack<Integer> st = new Stack<>();
		int nse[] = new int[arr.length];
		int pse[] = new int[arr.length];
		for(int i = 0; i<arr.length; i++)
		{
			while(st.size() > 0 && arr[i] < arr[st.peek()])
			{
				nse[st.peek()] = i;
				st.pop();
			}
			if(st.isEmpty())
			{
				nse[i] = arr.length;
			}
			st.push(i);
		}
		while(!st.isEmpty())
		{
			nse[st.peek()] = arr.length;
			st.pop();
		}
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
			else if(arr[i] > arr[st.peek()])
			{
				pse[i] = st.peek();
			}
			st.push(i);
		}
		for(int i= 0; i<arr.length; i++)
		{
			System.out.println(arr[i] +"   =   "+nse[i] + " ," + pse[i]);
		}
		int maxArea = 0;
		int area;
		for(int i = 0; i<arr.length; i++)
		{
			area = arr[i] * (nse[i] - pse[i]-1);
			if(area > maxArea)
			{
				maxArea = area;
			}
		}
		System.out.println(maxArea);
	}
}
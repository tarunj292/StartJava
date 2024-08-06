import java.util.ArrayList;
class ArrayListDemo
{
	public static void main(String [] args)
	{
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(56);
		nums.add(5);
		nums.add(6);
		nums.add(7);
		nums.add(8);
		nums.add(9);
		nums.add(1);
		nums.add(4);
		
		Integer x = 5;
		System.out.println(nums.remove(x));
		
		for(int i = 0; i<nums.size(); i++)
			System.out.println(nums.get(i));
		System.out.println("Contains " + nums.contains(x));
		System.out.println("Index Of " + nums.indexOf(4));
	}
}
class RESTRA
{
	private int foodCode;
	private String food,foodType, sticker;
	private void getSticker()
	{
		if(foodType.equalsIgnoreCase("Vegetarian"))
			sticker = "GREEN";
		else if(foodType.equalsIgnoreCase("Contains Egg"))
			sticker = "YELLOW";
		else if(foodType.equalsIgnoreCase("Non-Vegetarian"))
			sticker = "RED";
	}
	public void getFood()
	{
		foodCode = 1;
		food = "Matar Paneer";
		foodType = "Vegetarian";
		getSticker();
	}
	public void showFood()
	{
		System.out.println("foodCode is "+foodCode);
		System.out.println("food is "+food);
		System.out.println("foodType is "+foodType);
		System.out.println("Sticker is "+sticker);
	}
}
class RestraDemo
{
	public static void main(String [] args)
	{
		RESTRA r1 = new RESTRA();
		r1.getFood();
		r1.showFood();
	}
}
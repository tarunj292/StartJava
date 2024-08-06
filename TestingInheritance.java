class Publication
{
	String title;
	float price;
	Publication(String title, float price)
	{
		this.title = title;
		this.price = price;
	}
	void displayDetails()
	{
		System.out.println("Title is " + title + "Price is " + price);
	}
}
class Book extends Publication
{
	int pageCount;
	Book(String title, float price, int pageCount)
	{
		super(title, price);
		this.pageCount = pageCount;
	}
	void displayDetails()
	{
		super.displayDetails();
		System.out.println("Page count: " + pageCount);
	}
}
class CD extends Publication
{
	int timeMinutes;
	CD(String title, float price, int minutes)
	{
		super(title, price);
		this.timeMinutes = timeMinutes;
	}
	void displayDetails()
	{
		super.displayDetails();
		System.out.println("Length of CD(in minutes): " + timeMinutes);
	}
}
class TestingInheritance
{
	public static void main(String [] args)
	{
		Publication pb = new Publication("Rich Dad Poor Dad", 19.99f);
		pb.displayDetails();
		System.out.println();

		Book bk = new Book("How to win friends and influence people", 29.99f, 300);
		bk.displayDetails();
		System.out.println();
		
		CD cd = new CD("Teri Meri Meri Teri", 9.99f, 160);
		cd.displayDetails();
	}
}
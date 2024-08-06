/*Imagine a publishing company that markets both book and CD versions of its works. Create
a class called Publication that stores the title (a string) and price (a float) of a publication.
From this class, derive two classes: Book which adds a page count (type int); and CD, which
adds a playing time (type int) in minutes. Each of these classes should have constructors for
initializing their data members and a method for displaying the value of the data members.
Create another class for writing the main method and testing the inheritance hierarchy.*/
class Publication
{
	String title;
	float Price;
	Publication(String title, float Price)
	{
		this.title = title;
		this.Price = Price;
	}
	void getDetails()
	{
		System.out.println("Title is "+title+"\nPrice is "+Price);
	}
}
class Book extends Publication
{
	int pageCount;
	Book(String title, float Price, int pageCount)
	{
		super(title,Price);
		this.pageCount = pageCount;
	}
	void getDetails()
	{
		super.getDetails();
		System.out.println("Pages are "+pageCount);
	}
}
class CD extends Publication
{
	int playTime;
	CD(String title, float Price, int playTime)
	{
		super(title,Price);
		this.playTime = playTime;
	}
	void getDetails()
	{
		super.getDetails();
		System.out.println("Time is "+playTime+" in minutes");
	}
}
class PublicationDemo
{
	public static void main(String[] args)
	{
		Publication publication = new Publication("Rich Dad Poor Dad", 19.99f);
        	publication.getDetails();
        	System.out.println();

        	Book book = new Book("How to win friends and influence People", 29.99f, 300);
        	book.getDetails();
        	System.out.println();

        	CD cd = new CD("Teri Meri Meri Teri", 9.99f, 160);
        	cd.getDetails();
	}
}
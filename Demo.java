import java.io.*;
class Product implements Serializable
{
	int pid, price;
	String name;
	public Product(int productId, String name, int price)
	{
		pid = productId;	
		this.name = name;
		this.price = price;
	}
	public String toString()
	{
		return "Product ID: " + pid + "Name: " + name + "Price: " + price;
	}
}
class Demo
{
	public static void main(String [] args) throws IOException, ClassNotFoundException
	{
		Product p1 = new Product(45, "Shrikhand", 100);
		System.out.println("Product wrote: " + p1);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("products.txt"));
		oos.writeObject(p1);
		oos.close();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("products.txt"));
		Product p2 = (Product) ois.readObject();
		ois.close();
		System.out.println("Product read: " + p2);
	}
}
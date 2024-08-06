class Person
{
	String name;
	int age;
	Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	boolean findElder(Person p)
	{
		if(age>p.age)
			return true;
		else if(age<p.age)
			return false;
		return true;
	}
}
class PersonDemo
{
	public static void main(String [] args)
	{
		Person p = new Person("Tarun",20);
		Person p2 = new Person("Sejal",18);
		System.out.println("Is p > p1"+ p.findElder(p2));
	}
}
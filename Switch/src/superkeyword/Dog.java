package superkeyword;

public class Dog extends Animal{
	
	String color="Black";
	public void eat()
	{
		System.out.println("ëating bread");
	}

	public void sleep()
	{
		System.out.println("sleeping");
	}
   
	public void bark()
	{System.out.println("barking");}
	
	public void work()
	{
	super.eat();
		bark();
		System.out.println(this.color);
	}
}

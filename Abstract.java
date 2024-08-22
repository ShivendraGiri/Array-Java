package Youtube;
 abstract class animal
{
	void legs()
	{
		System.out.println( "All Animals have 4 Legs");
	}
	abstract void sound();
	abstract void eat();
		
	}
 class Dog extends animal
 {
	@Override
	void sound()
	{
		System.out.print("Bow Bow . . .");
	}
	void eat()
	{
		System.out.println("Meat eating");
	}
}
 class Cow extends animal
 {
	 @Override
	 void sound()
	 {
		 System.out.println("Ooo...Oooo...");
	 }
	 void eat()
	 {
		 System.out.println("Grass eating");
	 }
 }
public class Abstract {

	public static void main(String[] args) {
		Dog d=new Dog();
		Cow c= new Cow();
		
		d.sound(); d.eat();d.legs();
		c.sound(); c.eat();c.legs();
		

	}

}

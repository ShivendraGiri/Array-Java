package Youtube;

   class Class {

	int age=21;
	int weight = 54;
	String color = "Light";
	
	void eat()
	{
		System.out.println("I am Eating");
	}
	void Sleep()
	{
		System.out.println("I am Sleeping");
	}
	public static void main(String[] args) {
		Class P= new Class();
		System.out.println(P.age);
		System.out.println(P.weight);
		System.out.println(P.color);
		
		P.eat(); P.Sleep();
		
	}

}

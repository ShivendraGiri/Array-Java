package Youtube;


interface A
{
void Show();
}

interface B
{
	 void Show();

}
class Multiple implements A,B
{
	public void show()
	{
		System.out.println("Interface A & B");
	}

	public static void main(String[] args) {
		Multiple m=new Multiple();
		m.show();
		
	}

}

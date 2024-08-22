package Youtube;
 class A
 {
	 void input()
	 {
		 System.out.println("Enter your Name");
	 }
	 
 }
class B extends A
{
void show()
{
	System.out.println("My name is Shivendra ");
}
}
class C extends A
{
	void Disp()
	{
		System.out.println("My name is Goswami");
	}
}
class Hierachical
{
	public static void main(String args[]) {
		B r=new B();
		C r2=new C();
		
		r.input(); r.show();
		r2.input(); r2.Disp();
		
	}
}
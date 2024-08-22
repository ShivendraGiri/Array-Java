package Youtube;


class shivendra
{
	int roll , marks;
	String name;
	void input()
	{
		System.out.println("Enter roll name & Marks :");
	}
}
class SingleInharitance extends  shivendra
{
	void disp()
	{
		roll =1;name="shivendra"; marks=89;
		System.out.println(roll+" "+name+" "+marks);
	}
	public static void main(String[] args) {
		SingleInharitance r= new SingleInharitance();
		r.input(); r.disp();
	}
}

package Youtube;
class A{
	int a,b,c;
	void add()
	{
		a=10; b=20;
		c=a+b;
		System.out.println("Sum of Two Number" +c);
	}
	void sub()
	{
		a=200;
		b=34;
		c=a-b;
		System.out.println("Sub of two number"+c);
	}
}
class B extends A
{
	void multi()
	{
		a=10; b=20;
		c=a*b;
		System.out.println("Multiplication of two Numbers:" +c);
	}
	void div()
	{
		a= 10; b= 2;
		c=a/b;
		System.out.println("Division of two Numbers"+c);
	}
}
class C extends B
{
	void rem()
	{
		a=10;b=3;
		c=a%b;
		System.out.println("Reaminder of two Numbers" +c);
	}
	
}
class Multilevel
{
	public static void main(String[] args)
	{
	 C r=new C();
    r.add();
	r.sub(); 
	r.multi();
	r.div();
	r.rem();
	
}
}


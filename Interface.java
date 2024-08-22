package Youtube;

interface vehical
{
String Name="TVS";
int Speed = 1009;
void start();
void stop();

}
class Interface implements vehical
{
	@Override
	public void start()
	{
		System.out.println("start() : insert key & press start button");
	}
	@Override
	public void stop()
	{
		System.out.println("stop(): exit key");
		
	}
	public static void main(String []args)
	{
	
	Interface c=new Interface();
	c.start(); c.stop();
	
}
}


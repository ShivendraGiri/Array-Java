package Youtube;


		
 public class Parametrized{
	int x,y;
	Parametrized(int a , int b){
		x=a; y=b;
	}
	void show()
    {
		System.out.println(x+" "+y);
		}
}
class B{
	public static void main(String[] args) {
		Parametrized r=new Parametrized(100,200);
		r.show();
		
		
	}
}
	



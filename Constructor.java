package Youtube;

public class Constructor {

//	public static void main(String[] args) {
		int a; String name;
		Constructor(){
			
		a=0; name=null;	
			
		}
		void show ()
		{
			
 System.out.println(a+ " " +name);
	}
		class B{
			public static void main(String args[]) {
				Constructor ref =  new Constructor();
				ref.show();
			}
		}

}

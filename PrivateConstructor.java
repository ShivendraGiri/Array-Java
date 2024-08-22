package Youtube;

public class PrivateConstructor {

	

		int a; double b; String c;
		private  PrivateConstructor() {
			a=10; b=30; c="Shivendra";
			System.out.println(a+" "+" " +c);
		}
		public static void main(String[] args) {
			 PrivateConstructor r=new  PrivateConstructor();
	}

}

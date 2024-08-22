package Youtube;

import java.util.ArrayDeque;

public class ArrayDeque1 {

	public static void main(String[] args) {
		ArrayDeque<String> Name = new ArrayDeque<>();
		Name.add("Shivendra");
		Name.add("Giri");
		Name.push("Goswami");
		
		System.out.println(Name);
//		Name.pop();
		Name.remove();
	System.out.println(Name);
				

	}

}

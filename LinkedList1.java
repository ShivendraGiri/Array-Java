package Youtube;
import java.util.*;
public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList<String> Name= new LinkedList<String>();
		Name.add("Shivedra");
		Name.add("Giri");
		Name.add("Goswami");

	
System.out.println("Name");
Name.addFirst("Goswami");
Name.addLast("Giri");
System.out.println(Name);
Name.add(3,"Like");
System.out.println(Name);
Name.removeLast();
System.out.println(Name);
for(String str:Name) {
	System.out.println(str);
}
	}
}

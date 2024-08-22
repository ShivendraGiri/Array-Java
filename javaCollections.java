package Youtube;
import java.util.*;
public class javaCollections {

	public static void main(String[] args) {
	
   ArrayList<String> Name = new ArrayList<String>();
   Name.add("Shivendra");
   Name.add("\t Goswami");
   Name.add("\t Somendra");
   
   System.out.println(Name);
   Name.add("Google");
   System.out.println(Name);
   Name.add(1,"Class");
   System.out.println(Name);
   Name.remove("Class");
   System.out.println(Name);
   
   Name.set(3,"Program");
   
   System.out.println(Name);
   
   System.out.println(Name.get(0));
   Name.clear();
   System.out.println(Name);
	}

}

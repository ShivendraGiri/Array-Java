package Youtube;
import java.util.*;
public class Array1 {

	public static void main(String[] args) {
		int a[] = new int[5];
		System.out.println("Enter the Element :");
		Scanner  sc= new Scanner(System.in);
		for( int i=0;i<5;i++) {
			a[i] = sc.nextInt();
		}
//		Arrays.sort(a);
		System.out.println("\n Array Element :");
		for(int b : a) {
    System.out.print(b+" ");
	}

	}
}

package Youtube;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int a, b, c ;

 
  Scanner s =new Scanner(System.in);
  System.out.println("Enter the Number=");
  a=s.nextInt();
  b=s.nextInt();
  
 int  ch= s.nextInt();
  switch(ch)
  {
  case 1 :
  
  c=a+b;
  System.out.println("Sum of two number=" +c);
  break;
  
  default :System.out.println("Wrong Choice");
	 
 }
	}
}



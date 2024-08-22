package Youtube;
import java.io.*;
 class fileWriter {

	public static void main(String[] args) {
		try
		{
			FileWriter f= new FileWriter("C:\\Users\\satye\\Desktop\\LC.txt");
			try
			{
				f.write("Java Programming is Best");
			}
			finally
			{
				f.close();
			}
			System.out.println("Successfully Data Wrote in File");
		}
		catch(IOException i)
		{
			System.out.println(i);
		}
	}

}

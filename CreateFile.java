package Youtube;
import java.io.*;
 class CreateFile {

	public static void main(String[] args) {
		File f= new File("C:\\Lenevo\\Desktop\\CD.text");
		try
		{
		if(f.createNewFile())
		{
			System.out.println("File Successfully Create..!");
		}
		else
		{
			System.out.println("File Already Exist...!");
		}
		}
		catch(IOException i)
		{
			System.out.println("Exception Handled..!");
		}

	}

}

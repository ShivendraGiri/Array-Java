package Youtube;

import java.io.*;

class fileReader {

	public static void main(String[] args) {
		try
		{
			FileReader r= new FileReader("C:\\fileWriter");
			try
			{
				int i;
				while((i=r.read())!=-1);
				{
				System.out.println( (char)i);	
				}
			}
			finally
		{
			r.close();
		}
		}
		catch(IOException e)
		{
			System.out.println("Exception Handled");
		}

	}

}

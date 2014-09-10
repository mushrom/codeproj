import java.util.Scanner;
import java.util.LinkedList;
import java.io.*;

public class wordDictionary
{
	private String[] words;

	public wordDictionary( )
	{

	}

	public wordDictionary( String file_name )
	{
		System.out.println( "Opening " + file_name + " as the dictionary." );
	}

	public boolean readDictionary( String file_name ){
		Scanner reader;
		boolean ret = false;

		try {
			reader = new Scanner( new FileReader( file_name ));
			ret = true;

		} catch ( IOException e ){
			System.out.println( "Could not open file " + file_name );
		}

		return ret;
	}
}

package ie.dit;

import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.BufferedReader;

public class TuneBook
{
	ArrayList tunes = new ArrayList<Tune>;

	public TuneBook(String abcFile)
	{
		BufferedReader inputStream = null;

		try
		{
			inputStream = new BufferedReader(new FileReader(abcFile));

			String line;
			while((line = inputStream.readLine()) != null)
			{

			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(inputStream != null)
			{
				try
				{
					inputStream.close();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args)
    {
        TuneBook tb = new TuneBook("hnj0.abc");
        System.out.println(tb);

        Tune t = tb.findTune("Scotsman over the Border");
        t.play();
    }

    public String toString()
    {
    	StringBuffer sb = new StringBuffer(); 
    }

    public Tune findTune(String title)
    {
    	for(String t:tunes)
    	{
    		if(title.equals(t.title))
    		{
    			return t;
    		}
    	}

    	return "No results found!";
    }
}

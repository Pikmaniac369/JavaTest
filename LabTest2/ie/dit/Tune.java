package ie.dit;

public class Tune implements Player
{

	//Private fields
	private int x;
	private String title;
	private String altTitle;
	private String notation;

	//Public accessor methods
	public int getX()
	{
		return x;
	}

	public String getTitle()
	{
		return title;
	}

	public String getAltTitle()
	{
		return altTitle;
	}

	public String getNotation()
	{
		return notation;
	}

	//toString() method
	public String toString()
	{
		if(altTitle == null)
		{
			return x + ", " + title;
		}
		else
		{
			return x + ", " + title + ", " + altTitle;
		}
	}
}
package Classes;

import java.util.ArrayList;

/** 
 * @author Jakob Brand
 * More specific class
 */
public class Warlock extends Class
{
	private String description;
	private ArrayList<String> classFeatures;
	private int numCantripsKnown;
	private int numSpellsKnown;
	private ArrayList<String> spellsKnown;
	private String patron;
	
	Warlock() {
		
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public ArrayList<String> getClassFeatures()
	{
		return classFeatures;
	}

	public void setClassFeatures(ArrayList<String> classFeatures)
	{
		this.classFeatures = classFeatures;
	}

	public int getNumCantripsKnown()
	{
		return numCantripsKnown;
	}

	public void setNumCantripsKnown(int numCantripsKnown)
	{
		this.numCantripsKnown = numCantripsKnown;
	}

	public int getNumSpellsKnown()
	{
		return numSpellsKnown;
	}

	public void setNumSpellsKnown(int numSpellsKnown)
	{
		this.numSpellsKnown = numSpellsKnown;
	}

	public ArrayList<String> getSpellsKnown()
	{
		return spellsKnown;
	}

	public void setSpellsKnown(ArrayList<String> spellsKnown)
	{
		this.spellsKnown = spellsKnown;
	}

	public String getPatron()
	{
		return patron;
	}

	public void setPatron(String patron)
	{
		this.patron = patron;
	}
	
}

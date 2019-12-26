package Classes;

import java.util.ArrayList;

/**
 * @author Jakob Brand
 * More specific class
 */
public class Monk extends Class
{
	private String description;
	private ArrayList<String> classFeatures;
	
	Monk(){
		
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
	
}

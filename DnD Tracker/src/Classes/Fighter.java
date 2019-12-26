package Classes;

import java.util.ArrayList;

/**
 * @author Jakob Brand
 * More specific class
 */
public class Fighter extends Class
{
	private String description;
	private ArrayList<String> classFeatures;
	
	Fighter(){
		
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

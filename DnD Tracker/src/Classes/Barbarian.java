package Classes;
/**
 * @author Jakob Brand
 *The more specific class
 */
import java.util.ArrayList;

public class Barbarian extends Class
{
	private String description;
	private ArrayList<String> classFeatures;
	
	Barbarian() {
		
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

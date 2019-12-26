package Equipment;
/**
 * @author Jakob Brand
 *All equipment has these properties
 */

public class Equipment


{ 
	private String name;
	private String description;
	private int cost;
	private int weight;
	
	public Equipment() {
		
	}
	
	public Equipment(String name) {
		
	}
	
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public int getCost()
	{
		return cost;
	}

	public void setCost(int cost)
	{
		this.cost = cost;
	}

	public int getWeight()
	{
		return weight;
	}

	public void setWeight(int weight)
	{
		this.weight = weight;
	}
}
 
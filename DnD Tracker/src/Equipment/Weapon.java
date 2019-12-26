package Equipment;
/**
 * @author Jakob Brand
 *Weapon, a more specific type of epuipment
 */
import java.util.ArrayList;

public class Weapon extends Equipment {
	private String damage;
	private ArrayList<String> properties;
	private String type;
	
	public Weapon() {
		
	}

	public String getDamage()
	{
		return damage;
	}


	public void setDamage(String damage)
	{
		this.damage = damage;
	}


	public ArrayList<String> getProperties()
	{
		return properties;
	}


	public void setProperties(ArrayList<String> properties)
	{
		this.properties = properties;
	}


	public String getType()
	{
		return type;
	}


	public void setType(String type)
	{
		this.type = type;
	}
}

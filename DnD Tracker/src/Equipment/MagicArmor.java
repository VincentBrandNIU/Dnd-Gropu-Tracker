package Equipment;
/**
 * @author Jakob Brand
 *Extends armor if it is magical
 */
public class MagicArmor extends Armor
{
	private String affect;
	private String parameters;
	
	public MagicArmor() {
		
	}

	public String getAffect()
	{
		return affect;
	}

	public void setAffect(String affect)
	{
		this.affect = affect;
	}

	public String getParameters()
	{
		return parameters;
	}

	public void setParameters(String parameters)
	{
		this.parameters = parameters;
	}
	
}

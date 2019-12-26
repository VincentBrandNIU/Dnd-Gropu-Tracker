package Equipment;
/**
 * @author Jakob Brand
 *Extends weapon if the weapon is magical
 */
public class MagicWeapon extends Weapon
{
	private String affect;
	private String parameters;
	
	public MagicWeapon() {
		
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

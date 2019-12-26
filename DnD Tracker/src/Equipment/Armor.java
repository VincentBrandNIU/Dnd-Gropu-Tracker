package Equipment;
/**
 * @author Jakob Brand
 *Armor, a more specific type of equipment
 */
public class Armor extends Equipment
{
	private int armorClass;
	private int strengthRequirement;
	private boolean stealthDisadvantage;
	
	public Armor() {
		
	}

	public int getArmorClass()
	{
		return armorClass;
	}

	public void setArmorClass(int armorClass)
	{
		this.armorClass = armorClass;
	}

	public int getStrengthRequirement()
	{
		return strengthRequirement;
	}

	public void setStrengthRequirement(int strengthRequirement)
	{
		this.strengthRequirement = strengthRequirement;
	}

	public boolean isStealthDisadvantage()
	{
		return stealthDisadvantage;
	}

	public void setStealthDisadvantage(boolean stealthDisadvantage)
	{
		this.stealthDisadvantage = stealthDisadvantage;
	}
}

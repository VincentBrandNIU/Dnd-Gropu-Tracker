package Classes;
/**
 * @author Jakob Brand 
 * The more specific class
 */
import java.util.ArrayList;

public class Cleric extends Class
{
	private String description;
	private ArrayList<String> classFeatures;
	private int numCantripsKnown;
	private int numSpellsKnown;
	private ArrayList<String> spellsKnown;
	private String deity;
	private String divineDomain;
	
	Cleric(){
		ArrayList<String> awp = new ArrayList<String>();
		awp.set(0, "Light Armor");
		awp.set(1, "Medium Armor");
		awp.set(2, "Shields");
		awp.set(3, "Simple Weapons");
		
		
		super.setDescription("A priestly champion who wields divine magic in service of a higher power");
		super.setArmorWeaponProficiencies(awp);
		super.setHitDie("d8");
		super.setPrimaryAbility("Wisdom");
		super.setProficiencyBonus(2);
		super.setSavingThrowProficiencies("Wisdom & Charisma");
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

	public String getDeity()
	{
		return deity;
	}

	public void setDeity(String deity)
	{
		this.deity = deity;
	}

	public String getDivineDomain()
	{
		return divineDomain;
	}

	public void setDivineDomain(String divineDomain)
	{
		this.divineDomain = divineDomain;
	}
	
}

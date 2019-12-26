package Classes;
/**
 * @author Jakob Brand
 * More specific class
 */
import java.util.ArrayList;

public class Paladin extends Class
{
	private String description;
	private ArrayList<String> classFeatures;
	private int numCantripsKnown;
	private int numSpellsKnown;
	private ArrayList<String> spellsKnown;
	private String deity;
	private String oath;
	
	Paladin() {
		ArrayList<String> awp = new ArrayList<String>();
		awp.set(0, "All Armor");
		awp.set(1, "Shields");
		awp.set(2, "Simple Weapons");
		awp.set(3, "Martial Weapons");


		super.setDescription("A holy warrior bound to a sacred oath");
		super.setArmorWeaponProficiencies(awp);
		super.setHitDie("d10");
		super.setPrimaryAbility("Strength & Charisma");
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

	public String getOath()
	{
		return oath;
	}

	public void setOath(String oath)
	{
		this.oath = oath;
	}
	
}

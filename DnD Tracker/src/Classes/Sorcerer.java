package Classes;

import java.util.ArrayList;

/** 
 * @author Jakob Brand
 * More specific class
 */
public class Sorcerer extends Class
{
	private String description;
	private ArrayList<String> classFeatures;
	private int numCantripsKnown;
	private int numSpellsKnown;
	private ArrayList<String> spellsKnown;
	private String sourceOfPower;
	
	Sorcerer() {
		ArrayList<String> awp = new ArrayList<String>();
		awp.set(0, "Daggers");
		awp.set(1, "Darts");
		awp.set(2, "Slings");
		awp.set(3, "Quarterstaffs");
		awp.set(4, "Light Crossbows");


		super.setDescription("A spellcaster who draws on inherent magic from a gift or bloodline");
		super.setArmorWeaponProficiencies(awp);
		super.setHitDie("d6");
		super.setPrimaryAbility("Charisma");
		super.setProficiencyBonus(2);
		super.setSavingThrowProficiencies("Constitution & Charisma");

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

	public String getSourceOfPower()
	{
		return sourceOfPower;
	}

	public void setSourceOfPower(String sourceOfPower)
	{
		this.sourceOfPower = sourceOfPower;
	}
	
}

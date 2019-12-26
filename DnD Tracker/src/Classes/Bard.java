package Classes;

import java.util.ArrayList;

/**
 * @author Jakob Brand
 *The more specific class
 */
public class Bard extends Class
{
	private String description;
	private ArrayList<String> classFeatures;
	private int numCantripsKnown;
	private int numSpellsKnown;
	private ArrayList<String> spellsKnown;
	
	Bard(){
		ArrayList<String> awp = new ArrayList<String>();
		awp.set(0, "Light Armor");
		awp.set(1, "Simple Weapons");
		awp.set(2, "Hand Crossbows");
		awp.set(3, "Long Swords");
		awp.set(4, "Rapiers");
		awp.set(5, "Shortswords");
		
		
		super.setDescription("An inspiring magician whose power echoes the music of creation");
		super.setArmorWeaponProficiencies(awp);
		super.setHitDie("d8");
		super.setPrimaryAbility("Charisma");
		super.setProficiencyBonus(2);
		super.setSavingThrowProficiencies("Dexterity & Charisma");
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
}

package Classes;

import java.util.ArrayList;

/** 
 * @author Jakob Brand
 * More specific class
 */
public class Rogue extends Class
{
	private String description;
	private ArrayList<String> classFeatures;
	
	public Rogue() {
		ArrayList<String> awp = new ArrayList<String>();
		awp.set(0, "Light Armor");
		awp.set(1, "Simple Weapons");
		awp.set(2, "Hand Crossbows");
		awp.set(3, "Longswords");
		awp.set(4, "Rapiers");
		awp.set(5, "Shortswords");


		super.setDescription("A scoundrel who uses stealth and trickery to overcome obstacles and enemies");
		super.setArmorWeaponProficiencies(awp);
		super.setHitDie("d8");
		super.setPrimaryAbility("Dexterity");
		super.setProficiencyBonus(2);
		super.setSavingThrowProficiencies("Dexterity & Intelligence");

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

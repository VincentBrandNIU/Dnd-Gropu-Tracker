package Classes;

import java.util.ArrayList;

/**
 * @author Jakob Brand
 * More specific class
 */
public class Monk extends Class
{
	private String description;
	private ArrayList<String> classFeatures;
	
	Monk(){
		ArrayList<String> awp = new ArrayList<String>();
		awp.set(0, "Simple Weapons");
		awp.set(1, "Shortswords");


		super.setDescription("A master of martial arts, harnessing the power of the body in pursuit of physical and spiritual perfection");
		super.setArmorWeaponProficiencies(awp);
		super.setHitDie("d8");
		super.setPrimaryAbility("Dexterity & Wisdom");
		super.setProficiencyBonus(2);
		super.setSavingThrowProficiencies("Strength & Dexterity");
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

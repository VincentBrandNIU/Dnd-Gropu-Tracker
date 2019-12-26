package Classes;

import java.util.ArrayList;

/**
 * @author Jakob Brand
 * More specific class
 */
public class Fighter extends Class
{
	private String description;
	private ArrayList<String> classFeatures;
	
	
	/*
	 * The Fighter's primary ability can be strength
	 * or dexterity so I did not set it here, the player will have to
	 * choose it at character creation.
	 */
	Fighter(){
		ArrayList<String> awp = new ArrayList<String>();
		awp.set(0, "All Armor");
		awp.set(1, "Shields");
		awp.set(2, "Simple Weapons");
		awp.set(3, "Martial Weapons");


		super.setDescription("A master of martial combat, skilled with a variety of weapons and armor");
		super.setArmorWeaponProficiencies(awp);
		super.setHitDie("d10");
		super.setProficiencyBonus(2);
		super.setSavingThrowProficiencies("Strength & Constitution");
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

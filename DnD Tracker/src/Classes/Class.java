package Classes;

import java.util.ArrayList;

/**
 * @author Jakob Brand
 *Helper class for all of the classes.
 */
public class Class
{
	private String description;
	private int proficiencyBonus;
	private String primaryAbility;
	private String hitDie;
	private ArrayList<String> armorWeaponProficiencies;
	private String savingThrowProficiencies;
	private ArrayList<String> skills;
	
	Class(){
		
	}

	public int getProficiencyBonus()
	{
		return proficiencyBonus;
	}

	public void setProficiencyBonus(int proficiencyBonus)
	{
		this.proficiencyBonus = proficiencyBonus;
	}

	public String getPrimaryAbility()
	{
		return primaryAbility;
	}

	public void setPrimaryAbility(String primaryAbility)
	{
		this.primaryAbility = primaryAbility;
	}

	public String getHitDie()
	{
		return hitDie;
	}

	public void setHitDie(String hitDie)
	{
		this.hitDie = hitDie;
	}

	public ArrayList<String> getArmorWeaponProficiencies()
	{
		return armorWeaponProficiencies;
	}

	public void setArmorWeaponProficiencies(
			ArrayList<String> armorWeaponProficiencies)
	{
		this.armorWeaponProficiencies = armorWeaponProficiencies;
	}

	public String getSavingThrowProficiencies()
	{
		return savingThrowProficiencies;
	}

	public void setSavingThrowProficiencies(
			String savingThrowProficiencies)
	{
		this.savingThrowProficiencies = savingThrowProficiencies;
	}

	public ArrayList<String> getSkills()
	{
		return skills;
	}

	public void setSkills(ArrayList<String> skills)
	{
		this.skills = skills;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}
	
}
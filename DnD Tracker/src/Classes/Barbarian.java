package Classes;
/**
 * @author Jakob Brand
 *The more specific class
 */
import java.util.ArrayList;

public class Barbarian extends Class
{
	private ArrayList<String> classFeatures;
	
	Barbarian() {
		ArrayList<String> awp = new ArrayList<String>();
		awp.set(0, "Light Armor");
		awp.set(1, "Medium Armor");
		awp.set(2, "Shields");
		awp.set(3, "Simple Weapons");
		awp.set(4, "Martial Weapons");
		
		
		super.setDescription("A fierce warrior of primitive background who can enter a battle rage");
		super.setArmorWeaponProficiencies(awp);
		super.setHitDie("d12");
		super.setPrimaryAbility("Strength");
		super.setProficiencyBonus(2);
		super.setSavingThrowProficiencies("Strength & Constitution");
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

package Classes;
/**
 * @author Jakob Brand
 * More specific class
 */
import java.util.ArrayList;

public class Druid extends Class
{
	private String description;
	private ArrayList<String> classFeatures;
	private int numCantripsKnown;
	private int numSpellsKnown;
	private ArrayList<String> spellsKnown;
	private String deity;
	
	Druid(){
		ArrayList<String> awp = new ArrayList<String>();
		awp.set(0, "Light Armor (Nonmetal)");	
		awp.set(1, "Medium Armor (Nonmetal)");
		awp.set(2, "Shields (Nonmetal)");
		awp.set(3, "Clubs");
		awp.set(4, "Darts");
		awp.set(5, "Javelins");
		awp.set(6, "Maces");
		awp.set(7, "Quarterstaffs");
		awp.set(8, "Scimitars");
		awp.set(9, "Sickles");
		awp.set(10, "slings");
		awp.set(11, "Spears");
		
		

		super.setDescription("A priest of the Old Faith, wielding the powers of nature — moonlight and plant growth, fire and lightning — and adopting animal forms");
		super.setArmorWeaponProficiencies(awp);
		super.setHitDie("d8");
		super.setPrimaryAbility("Wisdom");
		super.setProficiencyBonus(2);
		super.setSavingThrowProficiencies("Intelligence & Wisdom");
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
	
}

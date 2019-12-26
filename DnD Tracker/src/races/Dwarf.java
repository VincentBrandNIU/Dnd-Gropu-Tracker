package races;
/**
 * 
 */

/**
 * @author Vincent Brand
 * Dwarf Subclass of Race
 *
 */
import java.util.ArrayList;
public class Dwarf extends Race{
	private int constitutionModifier = 2;
	private ArrayList<String> weaponProf = new ArrayList<String>();
	private ArrayList<String> featureProf = new ArrayList<String>();

	//Constructor
	public Dwarf() {
		super.setDescription("Dwarf");
		super.addLanguage("Common");
		super.addLanguage("Dwarvish");
		this.weaponProf.add("BattleAxe");
		this.weaponProf.add("Handaxe");
		this.weaponProf.add("Light Hammer");
		this.weaponProf.add("WarHammer");
		this.featureProf.add("Darkvision");
		this.featureProf.add("Tool Proficiency");
		this.featureProf.add("Stonecunning");
		this.featureProf.add("Dwarven Resilience");
		super.setSpeed(25);
	}
	
	public int getConstitutionModifier() {
		return constitutionModifier;
	}
	public ArrayList<String> getWeaponProf() {
		return weaponProf;
	}
	public ArrayList<String> getFeatureProf() {
		return featureProf;
	}
	public void addFeature(String feature) {
		this.featureProf.add(feature);
	}
}
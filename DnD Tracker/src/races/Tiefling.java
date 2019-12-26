package races;
/**
 * 
 */

/**
 * @author Vincent Brand 
 * Tiefling Sub class extends Race
 *
 */
import java.util.ArrayList;

public class Tiefling extends Race {
	private int intelligenceModifier = 1;
	private int charismaModifier = 2;;
	private ArrayList<String> weaponProf = new ArrayList<String>();
	private ArrayList<String> armorProf = new ArrayList<String>();
	private ArrayList<String> featureProf = new ArrayList<String>();
	//Constructor Method
	public Tiefling() {
		//Invoke methods to set arrayList
		super.setDescription("Teifling");
		super.addLanguage("Commmon");
		super.addLanguage("Infernal");
		this.weaponProf.add("Simple");
		this.weaponProf.add("Martial");
		this.armorProf.add("Simple");
		this.armorProf.add("Martial");
		this.featureProf.add("Infernal Legacy");
		this.featureProf.add("Hellish Resistance");
		this.featureProf.add("DarkVision");
		super.setSpeed(30);
	}
	public int getIntelligenceModifier() {
		return intelligenceModifier;
	}
	public int getCharismaModifier() {
		return charismaModifier;
	}
	public ArrayList<String> getWeaponProf() {
		return weaponProf;
	}
	public ArrayList<String> getArmorProf() {
		return armorProf;
	}
	public ArrayList<String> getFeatureProf() {
		return featureProf;
	}

	
}

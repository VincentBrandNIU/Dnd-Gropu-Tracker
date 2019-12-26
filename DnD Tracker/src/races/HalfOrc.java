/**
 * 
 */
package races;

/**
 * @author Vincent Brand
 *Half Orc Subclass extends Race
 */
import java.util.ArrayList;
public class HalfOrc extends Race{
	private int strenghtModifier = 2;
	private int constitutionModifier = 1;
	private ArrayList<String> featureProf = new ArrayList<String>();
	
	public HalfOrc() {
		super.addLanguage("Common");
		super.addLanguage("Orc");
		this.featureProf.add("Darkvision");
		this.featureProf.add("Menacing");
		this.featureProf.add("Relentless Endurance");
		this.featureProf.add("Savage Attacks");
		super.setSpeed(30);
		super.setDescription("Half-Orc");
	}
	public int getStrenghtModifier() {
		return strenghtModifier;
	}
	public int getConstitutionModifier() {
		return constitutionModifier;
	}
	public ArrayList<String> getFeatureProf() {
		return featureProf;
	}
	
}

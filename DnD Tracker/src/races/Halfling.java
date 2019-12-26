/**
 * 
 */
package races;

/**
 * @author Vincent Brand
 *Halfling Subclass of Race
 */
import java.util.ArrayList;
public class Halfling extends Race{
	private int dexterityModifier = 2;
	private ArrayList<String> featureProf = new ArrayList<String>();
	
	public Halfling() {
		this.featureProf.add("Lucky");
		this.featureProf.add("Brave");
		this.featureProf.add("Halfling Nimbleness");
		super.addLanguage("Common");
		super.addLanguage("Halfling");
		super.setSpeed(25);
		super.setDescription("Halfling");
	}
	public int getDexterityModifier() {
		return dexterityModifier;
	}
	public ArrayList<String> getFeatureProf() {
		return featureProf;
	}
	public void addFeature(String feat) {
		this.featureProf.add(feat);
	}
	
	
}

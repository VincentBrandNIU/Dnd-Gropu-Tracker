/**
 * 
 */
package races;

/**
 * @author Vincent Brand
 *
 */
import java.util.ArrayList;
public class Gnome extends Race {
	private int intelligenceModifier = 2;
	private ArrayList<String> featureProf = new ArrayList<String>();
	
	public Gnome() {
		super.addLanguage("Common");
		super.addLanguage("Gnomish");
		this.featureProf.add("Darkvision");
		this.featureProf.add("Gnome Cunning");
		super.setSpeed(25);
		super.setDescription("Gnome");
	}
	public int getIntelligenceModifier() {
		return intelligenceModifier;
	}
	public ArrayList<String> getFeatureProf() {
		return featureProf;
	}
	public void addFeatureProf(String feat) {
		this.featureProf.add(feat);
	}
}

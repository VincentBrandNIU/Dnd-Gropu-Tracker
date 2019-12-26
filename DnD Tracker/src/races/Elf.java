package races;
/**
 * 
 */

/**
 * @author Vincent Brand
 * Elf subclass of Race Look into refactoring code. 
 */
import java.util.ArrayList;
public class Elf extends Race{
	private int dexterityModifier;
	private ArrayList<String> featureProf = new ArrayList<String>();
	public Elf() {
		super.addLanguage("Common");
		super.addLanguage("Elvish");
		this.featureProf.add("Darkvision");
		this.featureProf.add("Keen Senses");
		this.featureProf.add("Fey Ancestry");
		this.featureProf.add("Trance");
		super.setSpeed(30);
		super.setDescription("Elf");
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

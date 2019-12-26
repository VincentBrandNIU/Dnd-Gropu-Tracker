/**
 * 
 */
package races;

import java.util.ArrayList;

/**
 * @author Vincent Brand
 *Human Variant Special Case for Race extends Race not human
 */
public class HumanVariant extends Race{
	private int abilityMod1 = 1;
	private int abilityMod2 = 1;
	private String abilityInc1;
	private String abilityInc2;
	private ArrayList<String> featureProf = new ArrayList<String>();
	
	public HumanVariant() {
		
	}
	public HumanVariant(String ability1, String ability2, String feat, String skill) {
		this.abilityInc1 = ability1;
		this.abilityInc2 = ability2;
		this.featureProf.add(feat);
		this.featureProf.add(skill);
		super.setSpeed(30);
		super.addLanguage("Common");
		super.setDescription("Human Variant");
	}
	
	public int getAbilityMod1() {
		return abilityMod1;
	}
	public void setAbilityMod1(int abilityMod1) {
		this.abilityMod1 = abilityMod1;
	}
	public int getAbilityMod2() {
		return abilityMod2;
	}
	public void setAbilityMod2(int abilityMod2) {
		this.abilityMod2 = abilityMod2;
	}
	public ArrayList<String> getFeatureProf() {
		return featureProf;
	}
	public void setFeatureProf(ArrayList<String> featureProf) {
		this.featureProf = featureProf;
	}
	public String getAbilityInc1() {
		return abilityInc1;
	}
	public void setAbilityInc1(String abilityInc1) {
		this.abilityInc1 = abilityInc1;
	}
	public String getAbilityInc2() {
		return abilityInc2;
	}
	public void setAbilityInc2(String abilityInc2) {
		this.abilityInc2 = abilityInc2;
	}

	
	
}

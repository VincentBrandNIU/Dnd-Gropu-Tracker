/**
 * 
 */
package races;

/**
 * @author Vincent Brand
 *Half Elf Class extends Race
 */
import java.util.ArrayList;
public class HalfElf extends Race{
	private int charismaModifier = 2;
	private int abiltiyMod1 = 1;
	private int abilityMod2 = 1;
	private String abilityChoice1;
	private String abilityChoice2;
	private String languageChoice;
	private String skillProf1;
	private String skillProf2;
	private ArrayList<String> featureProf = new ArrayList<String>();
	
	public HalfElf() {
		super.addLanguage("Common");
		super.addLanguage("Elvish");
		this.featureProf.add("Darkvision");
		this.featureProf.add("Fey Ancestry");
		super.setSpeed(30);
		super.setDescription("Half-elf");
	}
	public String getAbilityChoice1() {
		return abilityChoice1;
	}
	public void setAbilityChoice1(String abilityChoice1) {
		this.abilityChoice1 = abilityChoice1;
	}
	public String getAbilityChoice2() {
		return abilityChoice2;
	}
	public void setAbilityChoice2(String abilityChoice2) {
		this.abilityChoice2 = abilityChoice2;
	}
	public int getCharismaModifier() {
		return charismaModifier;
	}
	public int getAbiltiyMod1() {
		return abiltiyMod1;
	}
	public int getAbilityMod2() {
		return abilityMod2;
	}
	public ArrayList<String> getFeatureProf() {
		return featureProf;
	}
	public String getLanguageChoice() {
		return languageChoice;
	}
	public void setLanguageChoice(String languageChoice) {
		this.languageChoice = languageChoice;
		super.addLanguage(languageChoice);
	}
	public String getSkillProf1() {
		return skillProf1;
	}
	public void setSkillProf1(String skillProf1) {
		this.skillProf1 = skillProf1;
	}
	public String getSkillProf2() {
		return skillProf2;
	}
	public void setSkillProf2(String skillProf2) {
		this.skillProf2 = skillProf2;
	}
	
	
}

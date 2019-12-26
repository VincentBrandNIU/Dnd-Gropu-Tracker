/**
 * 
 */
package races;

/**
 * @author Vincent Brand
 * HighElf subclass of Elf
 */
import java.util.ArrayList;
public class HighElf extends Elf{
	private int intelligenceModifier = 1;
	private ArrayList<String> weaponProf = new ArrayList<String>();
	
	public HighElf() {
		super();
		this.weaponProf.add("Longsword");
		this.weaponProf.add("Shortsword");
		this.weaponProf.add("Shortbow");
		this.weaponProf.add("Longbow");
		super.addFeature("Cantrip");
		super.addFeature("Extra Language");
		super.setDescription("High elf");
		
	}

	public int getIntelligenceModifier() {
		return intelligenceModifier;
	}

	public ArrayList<String> getWeaponProf() {
		return weaponProf;
	}
}

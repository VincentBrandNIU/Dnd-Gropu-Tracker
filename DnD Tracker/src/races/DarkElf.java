/**
 * 
 */
package races;

/**
 * @author Vincent Brand
 *DarkElf subclass of Elf
 */
import java.util.ArrayList;
public class DarkElf extends Elf{

	private int charismaModifier = 1;
	private ArrayList<String> weaponProf = new ArrayList<String>();
	
	public DarkElf() {
		this.weaponProf.add("Rapier");
		this.weaponProf.add("Shortsword");
		this.weaponProf.add("Hand Crossbow");
		super.addFeature("Superior Darkvision");
		super.addFeature("Sunlight Sensitivity");
		super.addFeature("Drow Magic");
		super.setDescription("Dark Elf");
	}
	public int getCharismaModifier() {
		return charismaModifier;
	}
	public ArrayList<String> getWeaponProf() {
		return weaponProf;
	}
	
	
}

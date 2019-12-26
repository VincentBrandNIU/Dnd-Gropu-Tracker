/**
 * 
 */
package races;

/**
 * @author Vincent Brand
 * Wood Elf subclass of Elf
 */
import java.util.ArrayList;
public class WoodElf extends Elf{
	private int wisdomModifier = 1;
	private ArrayList<String> weaponProf = new ArrayList<String>();
	
	public WoodElf() {
		super();
		this.weaponProf.add("Longsword");
		this.weaponProf.add("Shortsword");
		this.weaponProf.add("Shortbow");
		this.weaponProf.add("Longbow");
		super.addFeature("Mask of the Wild");
		super.setSpeed(35);
		super.setDescription("Wood Elf");
	}
	public int getWisdomModifier() {
		return wisdomModifier;
	}
	public ArrayList<String> getWeaponProf() {
		return weaponProf;
	}
	

}

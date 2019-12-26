package races;
/**
 * 
 */

/**
 * @author Vincent Brand
 * Moutain Dwarf subclass of Dwarf
 *
 */
import java.util.ArrayList;
public class MountainDwarf extends Dwarf{
	private int strengthModifier = 2;
	private ArrayList<String> armorProf = new ArrayList<String>();
	
	public MountainDwarf() {
		super();
		this.armorProf.add("Light Armor");
		this.armorProf.add("Medium Armor");
		super.setDescription("Mountain Dwarf");
	}
	
	public int getStrengthModifier() {
		return this.strengthModifier;
	}
}

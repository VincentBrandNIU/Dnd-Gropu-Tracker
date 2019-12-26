package races;

/**
 * 
 */

/**
 * @author Vincent Brand
 * Hill Dwarf subclass of Dwarf
 *
 */
public class HillDwarf extends Dwarf{
	private int wisdomModifier = 1;
	
	public HillDwarf() {
		super();
		super.addFeature("Dwarven Toughness");
		super.setDescription("Hill Dwarf");
	}

	public int getWisdomModifier() {
		return wisdomModifier;
	}

}

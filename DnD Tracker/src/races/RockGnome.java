/**	
 * 
 */
package races;

/**
 * @author Vincent Brand
 *RockGnome subclass extends Gnome
 */
public class RockGnome extends Gnome{
	private int constitutionModifier = 1;
	
	public RockGnome() {
		super();
		super.addFeatureProf("Artificer's Lore");
		super.addFeatureProf("Tinker");
		super.setDescription("Rock Gnome");
	}

	public int getConstitutionModifier() {
		return constitutionModifier;
	}
}

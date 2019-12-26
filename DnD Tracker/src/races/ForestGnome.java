/**
 * 
 */
package races;

/**
 * @author Vincent Brand
 *Subclass ForestGnome extends Gnome
 */
public class ForestGnome extends Gnome {
	private int dexterityModifier = 1;
	
	public ForestGnome() {
		super();
		super.addFeatureProf("Natural Illusionist");
		super.addFeatureProf("Speak with Small Beasts");
		super.setDescription("Forest Gnome");
	}

	public int getDexterityModifier() {
		return dexterityModifier;
	}
}

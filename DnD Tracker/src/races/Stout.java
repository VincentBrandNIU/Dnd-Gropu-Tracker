/**
 * 
 */
package races;

/**
 * @author Vincent Brand
 *Stout Subclass of Halfling
 */
public class Stout extends Halfling {
	private int constitutionModifier = 1;

	public Stout() {
		super();
		super.addFeature("Stout Resilience");
		super.setDescription("Stout Halfling");
	}
	public int getConstitutionModifier() {
		return constitutionModifier;
	}
}

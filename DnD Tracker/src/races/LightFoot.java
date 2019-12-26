/**
 * 
 */
package races;

/**
 * @author Vincent Brand
 * Lightfoot subclass of Halfling
 */
public class LightFoot extends Halfling{
	private int charismaModifier = 1;

	public LightFoot() {
		super();
		super.addFeature("Naturally Stealthy");
		super.setDescription("LightFoot Halfling");
	}
	public int getCharismaModifier() {
		return charismaModifier;
	}
	

}

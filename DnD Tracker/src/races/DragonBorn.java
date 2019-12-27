/**
 * 
 */
package races;

/**
 * @author Vincent Brand
 *Dragon Born Subclass of Race
 */
import java.util.ArrayList;
import java.util.HashMap;
public class DragonBorn extends Race{
	private int strengthModifier = 2;
	private int charismaModifier = 1;
	private String dragonType;
	private HashMap<String,String> breathWeapon = new HashMap<String,String>();
	private ArrayList<String> featureProf = new ArrayList<String>();
	public DragonBorn() {
		super.addLanguage("Common");
		super.addLanguage("Draconic");
	}
	public DragonBorn(String type) {
		this.setDragonType(type);
		this.featureProf.add(buildFeatureString("Damage Resistance"));
		this.featureProf.add(buildFeatureString("Breath Weapon "));
		super.setSpeed(30);		
	}
	
	private String buildFeatureString(String begin) {
		StringBuilder feature = new StringBuilder();
		feature.append(begin);
		feature.append(this.breathWeapon.keySet().toArray()[0].toString());
		return feature.toString();
	}
	public int getStrengthModifier() {
		return strengthModifier;
	}
	public int getCharismaModifier() {
		return charismaModifier;
	}
	public String getDragonType() {
		return dragonType;
	}
	public HashMap<String, String> getBreathWeapon() {
		return breathWeapon;
	}
	public ArrayList<String> getFeatureProf() {
		return featureProf;
	}
	public void setDragonType(String type) {
		this.dragonType = type;
		switch(type) {
			case("Black"):
				this.breathWeapon.put("Acid", "5 by 30 ft. line");
				break;
			case("Blue"):
				this.breathWeapon.put("Lightning", "5 by 30 ft. line");
				break;
			case("Brass"):
				this.breathWeapon.put("Fire", "5 by 30 ft. line");
				break;
			case("Bronze"):
				this.breathWeapon.put("Lightning", "5 by 30 ft. line");
				break;
			case("Copper"):
				this.breathWeapon.put("Acid", "5 by 30 ft. line");
				break;
			case("Gold"):
				this.breathWeapon.put("Fire", "15 ft. cone");
				break;
			case("Green"):
				this.breathWeapon.put("Poison", "15 ft. cone");
				break;
			case("Red"):
				this.breathWeapon.put("Fire", "15 ft. cone");
				break;
			case("Silver"):
				this.breathWeapon.put("Cold", "15 ft. cone");
				break;
			case("White"):
				this.breathWeapon.put("Cold", "15 ft. cone");
				break;
		}
			
	}
}

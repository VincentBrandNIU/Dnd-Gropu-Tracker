package races;
/*
 * @auth: Vincent Brand 
 * Human Subclass inherits attributes from the Race class
 */
import java.util.ArrayList;

public class Human extends Race {
	private int attributeBonus = 1;
	private ArrayList<String> description = new ArrayList<String>();

	public Human() {
		this.description.add("Human");
		super.addLanguage("Common");
		super.setSpeed(30);
	}
	public int getAttributeBonus() {
		return attributeBonus;
	}

	
}

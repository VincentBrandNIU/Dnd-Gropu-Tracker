package races;
/**
 * 
 */

/**
 * @author Vincent Brand 
 * Race Super Class
 * Rafactor Notes add All proficienciesand add modifiers to it only call in appropriate classes. 
 * Add speed to Race, since all races will have Speed. 
 */
import java.util.ArrayList;
public class Race {
	private int strength;
	private int dexterity;
	private int constituion;
	private int wisdom;
	private int intelligence;
	private int charisma;
	private int speed;
	private String description;
	private ArrayList<String> languages = new ArrayList<String>();
	//Constructor for testing
	public Race() {
		
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getDexterity() {
		return dexterity;
	}
	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}
	public int getConstituion() {
		return constituion;
	}
	public void setConstituion(int constituion) {
		this.constituion = constituion;
	}
	public int getWisdom() {
		return wisdom;
	}
	public void setWisdom(int wisdom) {
		this.wisdom = wisdom;
	}
	public int getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	public int getCharisma() {
		return charisma;
	}
	public void setCharisma(int charisma) {
		this.charisma = charisma;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public ArrayList<String> getLanguages() {
		return languages;
	}
	public void setLanguages(ArrayList<String> languages) {
		this.languages = languages;
	}
	public void addLanguage(String lan) {
		this.languages.add(lan);
	}
	
}

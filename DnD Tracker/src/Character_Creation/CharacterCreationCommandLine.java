package Character_Creation;
import races.*;
import Equipment.*;
import java.util.ArrayList;
import java.util.Scanner;
import Classes.*;
import testingEnvironment.DiceRoller;

//Character creator for testing logic and what not before generating UI
public class CharacterCreationCommandLine {
		static Scanner inputScan = new Scanner(System.in);
		static DiceRoller dice = new DiceRoller();
		static Classes.Class charClass = new Classes.Class();
		static races.Race charRace = new races.Race();
		static String inputRace;
		static String inputClass;
		static String inputName;
	public static void main(String[] args) {
		//Testing character creation
		//Ask user input for Character Race
		try {
			System.out.print("Enter Character Race:");
			inputRace = inputScan.nextLine().trim();
		}
		catch(Exception e) {
			System.out.println("Issue  with Race Scanner Exception: " + e);
		}
	    try {
	    	charRace = raceSelectionFunction(inputRace);
	    	System.out.println(charRace.getDescription());
	    }
	    catch(Exception e){
	    	System.out.println("Error when Selecting Race. Exception: " + e);
	    }
		try {
			System.out.print("Enter Character Class:");
			inputClass = inputScan.nextLine().trim();
		}
		catch(Exception e ) {
			System.out.println("Issue with Class Scanner Exception: " + e);
		}
		try {
			charClass = determineClassObject(inputClass);
			System.out.println(charClass.getDescription());
		}
		catch(Exception e) {
			System.out.println("Errow when selecting Class. Exception: " + e);
		}
		try {
			System.out.print("Enter Character Name");
			inputName = inputScan.nextLine().trim();
		}
		catch(Exception e) {
			System.out.println("Issue with Character name Scanner Exception: " + e);
		}
	}
	//Select what kind of class the character is going to be needs to match string Ideal for drop downs
	//Not ideal for Text base additions so maybe refactor to search in either all lower all upper and like. 
	private static Classes.Class determineClassObject(String input) {
		Classes.Class returnClass = new Classes.Class();
		
		switch (input){
		case "Barbarian":
			returnClass = new Classes.Barbarian();
			return returnClass;
		case "Bard":
			returnClass = new Classes.Bard();
			return returnClass;
		case "Cleric":
			returnClass = new Classes.Cleric();
			return returnClass;
		case "Druid":
			returnClass = new Classes.Druid();
			return returnClass;
		case "Fighter":
			returnClass = new Classes.Fighter();
			return returnClass;
		case "Monk":
			returnClass = new Classes.Monk();
			return returnClass;
		case "Paladin":
			returnClass = new Classes.Paladin();
			return returnClass;
		case "Ranger":
			returnClass = new Classes.Ranger();
			return returnClass;
		case "Rogue":
			returnClass = new Classes.Rogue();
			return returnClass;
		case "Sorcerer":
			returnClass = new Classes.Sorcerer();
			return returnClass;
		case "Warlock":
			returnClass = new Classes.Warlock();
			return returnClass;
		case "Wizard":
			returnClass = new Classes.Wizard();
			return returnClass;
		default:
			return returnClass;
		}
	}
	private static races.Race raceSelectionFunction(String input){
		races.Race returnRace = new races.Race();
		switch(input) {
		case "DarkElf":
			returnRace = new races.DarkElf();
			return returnRace;
		case "DragonBorn":
			returnRace = new races.DragonBorn();
			return returnRace;
		case "Elf":
			returnRace = new races.Elf();
			return returnRace;
		case "ForestGnome":
			returnRace = new races.ForestGnome();
			return returnRace;
		case "Gnome":
			returnRace = new races.Gnome();
			return returnRace;
		case "HalfElf":
			returnRace = new races.HalfElf();
			return returnRace;
		case "Halfling":
			returnRace = new races.Halfling();
			return returnRace;
		case "HalfOrc":
			returnRace = new races.HalfOrc();
			return returnRace;
		case "HighElf":
			returnRace = new races.HighElf();
			return returnRace;
		case "HillDwarf":
			returnRace = new races.HillDwarf();
			return returnRace;
		case "Human":
			returnRace = new races.Human();
			return returnRace;
		case "HumanVariant":
			returnRace = new races.HumanVariant();
			return returnRace;
		case "LightFoot":
			returnRace = new races.LightFoot();
			return returnRace;
		case "MountainDwarf":
			returnRace = new races.MountainDwarf();
			return returnRace;
		case "RockGnome":
			returnRace = new races.RockGnome();
			return returnRace;
		case "Stout":
			returnRace = new races.Stout();
			return returnRace;
		case "Tiefling":
			returnRace = new races.Tiefling();
			return returnRace;
		case "WoodElf":
			returnRace = new races.WoodElf();
			return returnRace;
		default:
			return returnRace;
		}
	}
	
}

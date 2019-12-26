package testingEnvironment;
import races.*;
import java.util.ArrayList;
import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		//Testing character creation
		//Ask user input for Character Race
		Scanner inputScan = new Scanner(System.in);
		System.out.print("Enter Character Race:");
		String inputRace = inputScan.nextLine().trim();
		//Test input Race
		//Add later
		System.out.print("Enter Character Class:");
		String inputClass = inputScan.nextLine().trim();
		//Test input class for validation
		//Add Later
		//String inputName = inputScan.nextLine().trim();
	    DiceRoller dice = new DiceRoller();
	    int roll = dice.d20();
	    System.out.println(roll);
	    ArrayList<Integer> testArray = new ArrayList<>();
	    testArray = dice.d20(100);
	    System.out.println(testArray);
	}
	
}

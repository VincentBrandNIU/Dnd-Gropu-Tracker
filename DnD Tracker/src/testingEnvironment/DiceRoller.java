/**
 * 
 */
package testingEnvironment;

/**
 * @author Vincent Brand 
 *
 */
import java.util.ArrayList;
import java.util.Random;
public class DiceRoller {

	public int  d20() {
		Random diceRoll = new Random();
		return 1 + diceRoll.nextInt(20);
	}
	//Overloaded method for the d20dice roll to roll as many as needed. 
	public ArrayList<Integer> d20(int times){
		ArrayList<Integer> returnNums = new ArrayList<Integer>();
		for(int i = 0; i < times; i++) {
			returnNums.add(d20());
			}
		return returnNums;
	}
	public int d100() {
		Random diceRoll = new Random();
		return 1 + diceRoll.nextInt(100);
	}
	//Overloaded method for the d100dice roll to roll as many as needed. 
	public ArrayList<Integer> d100(int times){
		ArrayList<Integer> returnNums = new ArrayList<Integer>();
		for(int i = 0; i < times; i++) {
			returnNums.add(d100());
			}
		return returnNums;
	}
	public int d12() {
		Random diceRoll = new Random();
		return 1 + diceRoll.nextInt(12);
	}
	public ArrayList<Integer> d12(int times){
		ArrayList<Integer> returnNums = new ArrayList<Integer>();
		for(int i = 0; i < times; i++) {
			returnNums.add(d12());
			}
		return returnNums;
	}
	public int d10() {
		Random diceRoll = new Random();
		return 1 + diceRoll.nextInt(10);
	}
	public ArrayList<Integer> d10(int times){
		ArrayList<Integer> returnNums = new ArrayList<Integer>();
		for(int i = 0; i < times; i++) {
			returnNums.add(d10());
			}
		return returnNums;
	}
	public int d8() {
		Random diceRoll = new Random();
		return 1 + diceRoll.nextInt(8);
	}
	public ArrayList<Integer> d8(int times){
		ArrayList<Integer> returnNums = new ArrayList<Integer>();
		for(int i = 0; i < times; i++) {
			returnNums.add(d8());
			}
		return returnNums;
	}
	public int d6() {
		Random diceRoll = new Random();
		return 1 + diceRoll.nextInt(6);
	}
	public ArrayList<Integer> d6(int times){
		ArrayList<Integer> returnNums = new ArrayList<Integer>();
		for(int i = 0; i < times; i++) {
			returnNums.add(d6());
			}
		return returnNums;
	}
	public int addBonusDamageToDice(int bonus, int dice) {
		return bonus + dice;
	}
}
